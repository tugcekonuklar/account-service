package com.account.service.service;

import com.account.service.domain.ErrorCode;
import com.account.service.domain.ErrorResultException;
import com.account.service.domain.Transfer;
import com.account.service.domain.TransferResult;
import com.account.service.repository.AccountRepository;
import com.account.service.repository.InsertTransferCommand;
import com.account.service.repository.TransferRepository;
import com.account.service.repository.UpdateAccountCommand;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

@Slf4j
@Service
@Validated
@RequiredArgsConstructor
public class TransferMoneyService implements TransferMoneyUseCase {

  private final TransferRepository transferRepository;
  private final AccountRepository accountRepository;

  @Override
  public Transfer transferMoney(@Valid SendMoneyCommand command) {

    try {
       var sender = accountRepository.findByAccountId(command.getSenderAccountId());
       var receiver = accountRepository.findByAccountId(command.getReceiverAccountId());

      if (sender.getBalance().compareTo(command.getAmount()) < 0) {
        throw ErrorCode.NOT_SUFFICIENT_BALANCE.asErrorResult(command.getSenderAccountId());
      }

      sender.withdraw(command.getAmount());
      receiver.deposit(command.getAmount());

      accountRepository.update(UpdateAccountCommand.builder()
        .balance(sender.getBalance())
        .id(sender.getId())
        .name(sender.getName())
        .owner(sender.getOwner())
        .accountId(sender.getAccountId())
        .build());

      accountRepository.update(UpdateAccountCommand.builder()
        .balance(receiver.getBalance())
        .id(receiver.getId())
        .name(receiver.getName())
        .owner(receiver.getOwner())
        .accountId(receiver.getAccountId())
        .build());

      return transferRepository.save(InsertTransferCommand.builder()
        .senderAccountId(command.getSenderAccountId())
        .receiverAccountId(command.getReceiverAccountId())
        .amount(command.getAmount())
        .result(TransferResult.SUCCESSFUL)
        .build());

    } catch (final ErrorResultException ex) {
      log.error("Transaction failed : {}", ex.getMessage());
      transferRepository.save(InsertTransferCommand.builder()
        .senderAccountId(command.getSenderAccountId())
        .receiverAccountId(command.getReceiverAccountId())
        .amount(command.getAmount())
        .result(TransferResult.FAILED)
        .build());
      throw ex;
    }
  }
}

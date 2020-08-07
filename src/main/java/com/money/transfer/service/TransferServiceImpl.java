package com.money.transfer.service;

import com.money.transfer.domain.Status;
import com.money.transfer.domain.Transfer;
import com.money.transfer.repository.InsertCommand;
import com.money.transfer.repository.TransferRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.sql.Insert;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

@Slf4j
@Service
@Validated
@RequiredArgsConstructor
public class TransferServiceImpl implements TransferService {

  private final TransferRepository transferRepository;

  @Override
  public Transfer transferMoney(@Valid TransferCommand command) {
    // TODO: some business logic in here
    return transferRepository.save(InsertCommand.builder()
      .sender(command.getSender())
      .receiver(command.getReceiver())
      .amount(command.getAmount())
      .status(Status.SUCCESSFUL)
      .build());
  }
}

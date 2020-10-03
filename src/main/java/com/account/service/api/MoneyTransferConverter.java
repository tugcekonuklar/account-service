package com.account.service.api;

import com.account.service.api.dto.MoneyTransferRequest;
import com.account.service.api.dto.MoneyTransferResponse;
import com.account.service.domain.Transfer;
import com.account.service.service.SendMoneyCommand;
import lombok.experimental.UtilityClass;

@UtilityClass
public class MoneyTransferConverter {

  public static MoneyTransferResponse toResponse(final Transfer transfer) {
    return MoneyTransferResponse.builder()
      .id(transfer.getId())
      .senderAccountId(transfer.getSenderAccountId())
      .receiverAccountId(transfer.getReceiverAccountId())
      .amount(transfer.getAmount())
      .timeStamp(transfer.getCreatedAt())
      .result(transfer.getResult())
      .build();
  }

  public static SendMoneyCommand toCommand(final MoneyTransferRequest request) {
    return SendMoneyCommand.builder()
      .senderAccountId(request.getSenderAccountId())
      .receiverAccountId(request.getReceiverAccountId())
      .amount(request.getAmount())
      .build();
  }
}

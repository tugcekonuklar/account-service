package com.money.transfer.api;

import com.money.transfer.api.dto.MoneyTransferRequest;
import com.money.transfer.api.dto.MoneyTransferResponse;
import com.money.transfer.domain.Transfer;
import com.money.transfer.service.TransferCommand;
import lombok.experimental.UtilityClass;

@UtilityClass
public class MoneyTransferConverter {

  public static MoneyTransferResponse toResponse(final Transfer transfer) {
    return MoneyTransferResponse.builder()
      .id(transfer.getId())
      .sender(transfer.getSender())
      .receiver(transfer.getReceiver())
      .amount(transfer.getAmount())
      .timeStamp(transfer.getCreatedAt())
      .status(transfer.getStatus())
      .build();
  }

  public static TransferCommand toCommand(final MoneyTransferRequest request) {
    return TransferCommand.builder()
      .sender(request.getSender())
      .receiver(request.getReceiver())
      .amount(request.getAmount())
      .build();
  }
}

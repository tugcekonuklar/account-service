package com.money.transfer.repository;

import com.money.transfer.domain.Transfer;
import com.money.transfer.repository.jpa.MoneyTransferEntity;
import lombok.experimental.UtilityClass;

import java.time.Instant;

@UtilityClass
public class RepositoryConverter {

  public static MoneyTransferEntity toEntity(final InsertCommand command) {
    return MoneyTransferEntity.builder()
      .amount(command.getAmount())
      .sender(command.getSender())
      .receiver(command.getReceiver())
      .status(command.getStatus())
      .createdAt(Instant.now())
      .build();
  }

  public static Transfer toTransfer(final MoneyTransferEntity entity) {
    return Transfer.builder()
      .id(entity.getId())
      .amount(entity.getAmount())
      .sender(entity.getSender())
      .receiver(entity.getReceiver())
      .status(entity.getStatus())
      .createdAt(entity.getCreatedAt())
      .build();
  }
}

package com.money.transfer.api.dto;

import com.money.transfer.domain.Status;
import lombok.Builder;
import lombok.Value;

import java.time.Instant;

@Value
@Builder
public class MoneyTransferResponse {
  private Long id;
  private String sender;
  private String receiver;
  private Integer amount;
  private Status status;
  private Instant timeStamp;
}

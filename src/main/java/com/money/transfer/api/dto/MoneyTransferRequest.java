package com.money.transfer.api.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class MoneyTransferRequest {
  private String sender;
  private String receiver;
  private Integer amount;
}

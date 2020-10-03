package com.account.service.api.dto;

import lombok.Builder;
import lombok.Value;

import java.math.BigInteger;

@Value
@Builder
public class MoneyTransferRequest {
  private String senderAccountId;
  private String receiverAccountId;
  private BigInteger amount;
}

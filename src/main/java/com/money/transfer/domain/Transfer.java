package com.money.transfer.domain;

import lombok.Builder;
import lombok.Value;

import java.time.Instant;

@Value
@Builder
public class Transfer {
  private Long id;
  private String sender;
  private String receiver;
  private Integer amount;
  private Status status;
  private Instant createdAt;
}

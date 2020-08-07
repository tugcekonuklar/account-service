package com.money.transfer.repository;

import com.money.transfer.domain.Status;
import lombok.Builder;
import lombok.Value;
import lombok.With;

import java.time.Instant;

@Value
@Builder
@With
public class InsertCommand {
  private String sender;
  private String receiver;
  private Integer amount;
  private Status status;
  private Instant createdAt;
}

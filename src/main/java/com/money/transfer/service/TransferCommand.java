package com.money.transfer.service;

import lombok.Builder;
import lombok.Value;
import lombok.With;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Value
@Builder
public class TransferCommand {
  @NotNull
  private String sender;
  @NotNull
  private String receiver;
  @NotNull
  private Integer amount;
}

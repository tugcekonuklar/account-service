package com.money.transfer.service;

import com.money.transfer.domain.Transfer;

import javax.validation.Valid;

public interface TransferService {
  Transfer transferMoney(@Valid final TransferCommand command);
}

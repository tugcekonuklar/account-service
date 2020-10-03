package com.account.service.service;

import com.account.service.domain.Transfer;

import javax.validation.Valid;

public interface TransferMoneyUseCase {
  Transfer transferMoney(@Valid final SendMoneyCommand command);
}

package com.money.transfer.repository;

import com.money.transfer.domain.Transfer;

public interface TransferRepository {
  Transfer save(final InsertCommand command);
}

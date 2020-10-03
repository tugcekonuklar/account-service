package com.account.service.repository;

import com.account.service.domain.Transfer;

public interface TransferRepository {
  Transfer save(final InsertTransferCommand command);
}

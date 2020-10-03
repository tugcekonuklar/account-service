package com.account.service.repository;

import com.account.service.domain.Account;

public interface AccountRepository {
  Account findByAccountId(final String accountId);

  Account update(final UpdateAccountCommand command);
}

package com.account.service.repository;

import com.account.service.domain.Account;
import com.account.service.domain.ErrorCode;
import com.account.service.repository.jpa.AccountJpaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import static com.account.service.repository.RepositoryConverter.toAccount;
import static com.account.service.repository.RepositoryConverter.toAccountEntity;

@Slf4j
@Repository
@RequiredArgsConstructor
public class AccountRepositoryImpl implements AccountRepository {

  private final AccountJpaRepository accountJpaRepository;

  @Override
  public Account findByAccountId(final String accountId) {
    return accountJpaRepository.findByAccountId(accountId)
      .map(RepositoryConverter::toAccount)
      .orElseThrow(() -> ErrorCode.ACCOUNT_NOT_FOUND.asErrorResult(accountId));
  }

  @Override
  public Account update(final UpdateAccountCommand command) {
    return toAccount(accountJpaRepository.save(toAccountEntity(command)));
  }
}

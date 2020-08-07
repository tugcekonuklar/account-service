package com.money.transfer.repository;

import com.money.transfer.domain.Transfer;
import com.money.transfer.repository.jpa.MoneyTransferJpaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import static com.money.transfer.repository.RepositoryConverter.toEntity;
import static com.money.transfer.repository.RepositoryConverter.toTransfer;

@Slf4j
@Repository
@RequiredArgsConstructor
public class TransferRepositoryImpl implements TransferRepository {

  private final MoneyTransferJpaRepository weatherJpaRepository;

  @Override
  public Transfer save(final InsertCommand command) {
    log.info("Save weather with command : {}", command);
    return toTransfer(weatherJpaRepository.save(toEntity(command)));
  }

}

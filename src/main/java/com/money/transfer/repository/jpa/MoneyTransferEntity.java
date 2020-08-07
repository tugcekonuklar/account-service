package com.money.transfer.repository.jpa;

import com.money.transfer.domain.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "money_transfers")
public class MoneyTransferEntity {
  @Id
  @GeneratedValue(strategy = IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String sender;

  @Column(nullable = false)
  private String receiver;

  @Column(nullable = false)
  private Integer amount;

  @Column(nullable = false)
  @Enumerated(EnumType.STRING)
  private Status status;

  @Column(nullable = false)
  private Instant createdAt;
}

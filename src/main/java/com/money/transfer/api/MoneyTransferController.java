package com.money.transfer.api;

import com.money.transfer.api.dto.MoneyTransferRequest;
import com.money.transfer.api.dto.MoneyTransferResponse;
import com.money.transfer.service.TransferService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static com.money.transfer.api.MoneyTransferConverter.toCommand;
import static com.money.transfer.api.MoneyTransferConverter.toResponse;
import static org.springframework.http.HttpStatus.CREATED;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/transfers")
public class MoneyTransferController {

  private final TransferService service;

  @PostMapping
  @ResponseStatus(CREATED)
  public MoneyTransferResponse transferMoney(@RequestBody final MoneyTransferRequest request) {
    return toResponse(service.transferMoney(toCommand(request)));
  }

}

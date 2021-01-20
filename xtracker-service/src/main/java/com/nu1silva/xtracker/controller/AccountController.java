package com.nu1silva.xtracker.controller;

import com.nu1silva.xtracker.model.Account;
import com.nu1silva.xtracker.model.AccountStatus;
import com.nu1silva.xtracker.model.AccountType;
import com.nu1silva.xtracker.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;
import java.util.UUID;

@RestController
@RequestMapping(path = "/api/account")
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createAccount(@RequestBody Account account) {
        account.setAccountId(UUID.randomUUID());
        account.setCreatedTime(ZonedDateTime.now());
        account.setLastUpdateTime(ZonedDateTime.now());
        account.setAccountStatus(AccountStatus.ACTIVE);
        account.setAccountType(AccountType.FREE);
        accountRepository.save(account);
    }

    public void deleteAccount(UUID accoundId) {}
}

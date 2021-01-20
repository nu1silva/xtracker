package com.nu1silva.xtracker.service;

import com.nu1silva.xtracker.model.Account;

import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public interface AccountService {

    Account create(Account account);
    Account delete(Account account);
    Account update(Account account);
    Set<Account> getAllAccounts();
    Optional<Account> getAccountByUUID(UUID accountId);
    Optional<Account> getAccountByEmail(String email);
}

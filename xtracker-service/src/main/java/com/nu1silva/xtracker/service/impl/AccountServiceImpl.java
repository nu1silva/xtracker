package com.nu1silva.xtracker.service.impl;

import com.nu1silva.xtracker.model.Account;
import com.nu1silva.xtracker.service.AccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;
import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    @Override
    public Account create(Account account) {
        return null;
    }

    @Override
    public Account delete(Account account) {
        return null;
    }

    @Override
    public Account update(Account account) {
        return null;
    }

    @Override
    public Set<Account> getAllAccounts() {
        return null;
    }

    @Override
    public Optional<Account> getAccountByUUID(UUID accountId) {
        return Optional.empty();
    }

    @Override
    public Optional<Account> getAccountByEmail(String email) {
        return Optional.empty();
    }
}

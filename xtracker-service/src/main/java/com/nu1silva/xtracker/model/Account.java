package com.nu1silva.xtracker.model;

import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;
import java.util.UUID;

@Getter
@Setter
public class Account {

    private UUID accountId;
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private ZonedDateTime createdTime;
    private ZonedDateTime lastUpdateTime;
    private AccountStatus accountStatus;
    private AccountType accountType;
}

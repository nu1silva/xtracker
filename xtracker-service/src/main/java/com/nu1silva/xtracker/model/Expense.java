package com.nu1silva.xtracker.model;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Expense {

    private UUID expenseId;
    private UUID accountId;
    private UUID categoryId;
    private double amount;
    private String description;
}

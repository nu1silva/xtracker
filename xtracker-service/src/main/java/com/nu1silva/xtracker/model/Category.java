package com.nu1silva.xtracker.model;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Category {

    private UUID categoryId;
    private String categoryName;
    private String description;
    private UUID accountId;
    private CateogyStatus cateogyStatus;
}

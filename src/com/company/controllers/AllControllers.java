package com.company.controllers;

import com.company.entities.Front;
import com.company.repositories.interfaces.IAllRepositories;

import java.util.List;

public class AllControllers implements IAllRepositories {
    private final IAllRepositories repository;

    public ProductController(IAllRepositories repository) {
            this.repository = repository;
        }

    public String getAllProducts() {
        List<Front> products = repository.getAllFront();
        return products.toString();
    }
}

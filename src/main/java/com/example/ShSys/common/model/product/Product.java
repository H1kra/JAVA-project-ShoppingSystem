package com.example.ShSys.common.model.product;


import jakarta.persistence.GeneratedValue;
import org.hibernate.validator.constraints.UUID;
import org.springframework.data.annotation.Id;

public class Product {
    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private String brandName;
    private String category;
    private String subCategory;
    private Double taxBracket;
    private String description;
}

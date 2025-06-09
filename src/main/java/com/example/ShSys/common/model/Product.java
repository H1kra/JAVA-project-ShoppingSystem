package com.example.ShSys.common.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import org.hibernate.validator.constraints.UUID;
import org.springframework.data.annotation.Id;

public class Product {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(unique=true, nullable=false)
    private String sku;

    private String name;
    private String brandName;
    private String category;
    private Double B2Bprice;
    private Double B2Cprice;
    private Double discoutB2Bprice;
    private Double discoutB2Cprice;
    private double taxBracket;
    private Long count;
    private String unitType;
    private String barCode;
    private String Picture;





}

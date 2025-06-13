package com.example.ShSys.common.model.product;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import org.hibernate.validator.constraints.UUID;
import org.springframework.data.annotation.Id;

public class ProductVariant {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(unique=true, nullable=false)
    private String sku;

    private String variantName;
    private String subSubCategory;

    private Double B2Bprice;
    private Double B2Cprice;
    private Double discoutB2Bprice;
    private Double discoutB2Cprice;

    private Long count;
    private String unitType;
    private String barCode;

    private String shortDescription;
}

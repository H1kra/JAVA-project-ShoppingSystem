package com.example.ShSys.common.enums.Product.ProductVariant;

public enum UnitType {
    PIECE("Pc"),
    KILOGRAM("Kg"),
    LITER("L"),
    BOX("Box");

    private final String label;

    UnitType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}

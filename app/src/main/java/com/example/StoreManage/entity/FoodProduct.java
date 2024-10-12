package com.example.StoreManage.entity;

import java.util.Date;

public class FoodProduct extends Product {
    private Date manufactureDate;
    private Date expiryDate;
    private String supplier;

    public FoodProduct(int id, String name, float tax, float unitPrice, int quantity, Date manufactureDate, Date expiryDate, String supplier) {
        super(id, name, tax, unitPrice, quantity);
        this.manufactureDate = manufactureDate;
        this.expiryDate = expiryDate;
        this.supplier = supplier;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }
}

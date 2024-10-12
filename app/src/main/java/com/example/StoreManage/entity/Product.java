package com.example.StoreManage.entity;

public abstract class Product {
    protected int id;
    protected String name;
    protected float tax;
    protected float unitPrice;
    protected int quantity;

    public Product(int id, String name, float tax, float unitPrice, int quantity) {
        this.id = id;
        this.name = name;
        this.tax = tax;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

package com.example.StoreManage.entity;

public class CrockeryProduct extends Product {
    private int warrantyPeriod;
    private float power;

    public CrockeryProduct(int id, String name, float tax, float unitPrice, int quantity, int warrantyPeriod, float power) {
        super(id, name, tax, unitPrice, quantity);
        this.warrantyPeriod = warrantyPeriod;
        this.power = power;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }
}

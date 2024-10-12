package com.example.StoreManage.entity;

import java.util.Date;

public class RefrigeratedProduct extends Product{
    private String manufacturer;
    private Date warehousingDate;

    public RefrigeratedProduct(int id, String name, float tax, float unitPrice, int quantity, String manufacturer, Date warehousingDate) {
        super(id, name, tax, unitPrice, quantity);
        this.manufacturer = manufacturer;
        this.warehousingDate = warehousingDate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Date getWarehousingDate() {
        return warehousingDate;
    }

    public void setWarehousingDate(Date warehousingDate) {
        this.warehousingDate = warehousingDate;
    }
}


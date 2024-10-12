package com.example.StoreManage.database;


import com.example.StoreManage.entity.Product;
import com.example.StoreManage.usecase.GetProductListDatabaseBoundary;

import java.util.ArrayList;
import java.util.List;

public class GetProductListDAOMySql implements GetProductListDatabaseBoundary {
    private List<Product> mockProductDB = null;
    public GetProductListDAOMySql(List<Product> mockProductDB){
        this.mockProductDB = mockProductDB;
    }
    @Override
    public List<Product> getAllProductList() {
        return  this.mockProductDB;
    }
}

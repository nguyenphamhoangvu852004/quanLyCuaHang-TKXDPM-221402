package com.example.StoreManage.usecase;

import com.example.StoreManage.entity.Product;

import java.util.List;

public interface GetProductListDatabaseBoundary {
    List<Product> getAllProductList();
}

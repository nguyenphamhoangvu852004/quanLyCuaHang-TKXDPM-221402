package com.example.StoreManage.usecase;

import com.example.StoreManage.entity.Product;

import java.util.List;

public class GetProductListUseCase implements GetProductListInputBoundary{
    GetProductListDatabaseBoundary getProductListDatabaseBoundary = null;
    GetProductListOutputBoundary getProductListOutputBoundary = null;

    public GetProductListUseCase(GetProductListDatabaseBoundary getProductListDatabaseBoundary, GetProductListOutputBoundary getProductListOutputBoundary) {
        this.getProductListDatabaseBoundary = getProductListDatabaseBoundary;
        this.getProductListOutputBoundary = getProductListOutputBoundary;
    }

    @Override
    public void execute() {
    List<Product> listProduct = getProductListDatabaseBoundary.getAllProductList();
    DataExport dataExport = new DataExport(listProduct);
    getProductListOutputBoundary.exportResult(dataExport);
    }
}

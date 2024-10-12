package com.example.StoreManage.usecase;

import com.example.StoreManage.entity.Product;

import java.util.List;

public class DataExport implements ResponseData{

    private List<Product> listProduct = null;

    public DataExport(List<Product> list){
        this.listProduct = list;
    }

    public List<Product> getListProduct(){
        return this.listProduct;
    }

}

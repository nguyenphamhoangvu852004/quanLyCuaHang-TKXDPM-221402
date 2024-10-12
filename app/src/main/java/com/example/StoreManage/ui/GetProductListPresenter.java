package com.example.StoreManage.ui;

import com.example.StoreManage.usecase.DataExport;
import com.example.StoreManage.usecase.GetProductListOutputBoundary;
import com.example.StoreManage.usecase.ResponseData;

public class GetProductListPresenter implements GetProductListOutputBoundary {

    private DataExport dataExport = null;

    @Override
    public void exportResult(ResponseData responseData) {
        this.dataExport = (DataExport) responseData;
    }

    public DataExport getDataExport(){
        return this.dataExport;
    }
}

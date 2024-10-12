package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.example.StoreManage.database.GetProductListDAOMySql;
import com.example.StoreManage.entity.CrockeryProduct;
import com.example.StoreManage.entity.Product;
import com.example.StoreManage.ui.GetProductListPresenter;
import com.example.StoreManage.usecase.GetProductListInputBoundary;
import com.example.StoreManage.usecase.GetProductListUseCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        GetProductListDAOMySql dao = new GetProductListDAOMySql(getData());
        GetProductListPresenter presenter = new GetProductListPresenter();
        GetProductListInputBoundary input = new GetProductListUseCase(dao,presenter);
        input.execute();

        assertEquals(3,presenter.getDataExport().getListProduct().size());
    }
    private List<Product> getData(){
        List<Product> list=  new ArrayList<>();
        CrockeryProduct c1 = new CrockeryProduct(1,"Sanh su1",2,2000,100,12,120);

        CrockeryProduct c2 = new CrockeryProduct(2,"sanhsu2",2,2500,80,6,110);

        CrockeryProduct c3 = new CrockeryProduct(3,"sanhsu 3",3,1500,30,8,115);

        list.add(c1);
        list.add(c2);
        list.add(c3);
                return list;
    }
}

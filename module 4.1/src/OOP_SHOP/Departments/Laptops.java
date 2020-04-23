package OOP_SHOP.Departments;

import OOP_SHOP.Products.AbstractProduct;
import OOP_SHOP.ShopAssistant;

import java.util.Arrays;
import java.util.Scanner;

public class Laptops extends AbstractDepartment{
    AbstractProduct[] laptops;
    ShopAssistant shopAssistant3;

    public Laptops(String departmentName, AbstractProduct[] laptops, ShopAssistant shopAssistant3){
        super(departmentName, shopAssistant3);
        this.laptops = laptops;

    }

    public void TalkWithCustomer(){


    }

}

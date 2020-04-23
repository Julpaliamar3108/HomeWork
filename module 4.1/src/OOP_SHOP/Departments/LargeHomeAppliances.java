package OOP_SHOP.Departments;

import OOP_SHOP.Products.AbstractProduct;
import OOP_SHOP.ShopAssistant;

import java.util.Scanner;

public class LargeHomeAppliances extends AbstractDepartment {
    AbstractProduct[] fridges;
    ShopAssistant shopAssistant2;

    public LargeHomeAppliances(String departmentName, AbstractProduct[] fridges, ShopAssistant shopAssistant2) {
        super(departmentName, shopAssistant2);
        this.fridges = fridges;
    }

    public void TalkWithCustomer(){


    }

}
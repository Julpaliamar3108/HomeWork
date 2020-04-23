package OOP_SHOP;

import OOP_SHOP.Products.AbstractProduct;

import java.util.Scanner;

public class ShopAssistant {
    private String assistantName;
    private String departmentName;
    AbstractProduct[] products;

    public ShopAssistant(String assistantName, String departmentName,AbstractProduct[] products){
        this.assistantName = assistantName;
        this.departmentName = departmentName;
        this.products = products;

    }

    public ShopAssistant() {

    }

    public void GiveInfoAboutProducts(AbstractProduct[] products){
        System.out.println("В наличие имеются: "+ '\n' +
                "1. " + products[0].toString() + '\n' +
                "2. " + products[1].toString());
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getAssistantName() {
        return assistantName;
    }

}


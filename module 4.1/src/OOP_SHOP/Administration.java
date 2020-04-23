package OOP_SHOP;


import OOP_SHOP.Departments.AbstractDepartment;
import OOP_SHOP.Products.AbstractProduct;

import java.util.Scanner;

public class Administration {
    ShopAssistant[] shopAssistants;
    AbstractDepartment[] departments;
    AbstractProduct[] products;

    public Administration(AbstractDepartment[] departments, AbstractProduct[] products, ShopAssistant[] shopAssistants) {
        this.departments = departments;
        this.products = products;
        this.shopAssistants = shopAssistants;
    }

    public void FindAssistant() {
        System.out.println("Что бы вы хотели приобрести?");
        Scanner scan = new Scanner(System.in);
        String productName = scan.nextLine();
        int count = 0;
        for (int i = 0; i < products.length; i++) {
            if ((products[i].getProductName().contains(productName))) {
                System.out.println("Ваш товар находится в отделе: " + products[i].getDepartmentName());
                count++;
                for (int j = 0; j < shopAssistants.length; j++)
                    if (products[i].getDepartmentName().equals(shopAssistants[j].getDepartmentName())) {
                        System.out.println("Обратитесь с консультанту по имени " + shopAssistants[j].getAssistantName());
                    }
                if (count == 1) {
                    break;
                }
            }
        }
    }
}


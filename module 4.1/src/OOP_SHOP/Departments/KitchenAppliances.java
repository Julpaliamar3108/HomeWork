package OOP_SHOP.Departments;

import OOP_SHOP.Products.AbstractProduct;
import OOP_SHOP.ShopAssistant;

import java.util.Scanner;

public class KitchenAppliances extends AbstractDepartment {
    AbstractProduct[] blenders;
    ShopAssistant shopAssistant1;

    public KitchenAppliances(String departmentName, AbstractProduct[] blenders, ShopAssistant shopAssistant1) {
        super(departmentName, shopAssistant1);
        this.blenders = blenders;
        this.shopAssistant1 = shopAssistant1;
    }

    public KitchenAppliances() {
        super();
    }

    public void TalkWithCustomer(){
        System.out.println("Добрый день, меня зовут " + shopAssistant1.getAssistantName());
        shopAssistant1.GiveInfoAboutProducts(blenders);
        System.out.println("Какой вариант вам подходит?");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number == 1){
            System.out.println(blenders[0].getProductName() + " отличный выбор. Проходите на кассу" );
        }
        else {
            System.out.println(blenders[1].getProductName() + " отличный выбор. Проходите на кассу");
        }

    }


}
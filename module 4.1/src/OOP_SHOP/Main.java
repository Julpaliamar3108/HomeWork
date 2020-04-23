package OOP_SHOP;

import OOP_SHOP.Customer.Customer;
import OOP_SHOP.Customer.CustomerWithDiscount;
import OOP_SHOP.Departments.AbstractDepartment;
import OOP_SHOP.Departments.KitchenAppliances;
import OOP_SHOP.Departments.Laptops;
import OOP_SHOP.Departments.LargeHomeAppliances;
import OOP_SHOP.Products.AbstractProduct;
import OOP_SHOP.Products.Blender;
import OOP_SHOP.Products.Fridge;
import OOP_SHOP.Products.Laptop;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        AbstractProduct[] products = new AbstractProduct[6];
        products[0] = new Blender("Блендер Braun", 900, "Техника для кухни", 2);
        products[1] = new Blender("Блендер Tefal", 1190 , "Техника для кухни", 4);
        products[2] = new Fridge("Холодильник Samsung", 20999, "Крупная бытовая техника", "Белый");
        products[3] = new Fridge("Холодильник Beko", 14999, "Крупная бытовая техника", "Серый");
        products[4] = new Laptop("Ноутбук MacBook", 31999, "Ноутбуки","13.3 дюйма");
        products[5] = new Laptop("Ноутбук Asus", 17999, "Ноутбуки","15 дюймов");

        AbstractProduct[] blenders = Arrays.copyOfRange(products, 0, 2);
        AbstractProduct[] fridges = Arrays.copyOfRange(products, 2, 4);
        AbstractProduct[] laptops = Arrays.copyOfRange(products, 4, products.length);

        ShopAssistant[] shopAssistants = new ShopAssistant[3];
        shopAssistants[0] = new ShopAssistant("Руслан","Техника для кухни", blenders);
        shopAssistants[1] = new ShopAssistant("Наталья","Крупная бытовая техника", fridges);
        shopAssistants[2] = new ShopAssistant("Стив","Ноутбуки", laptops);

        ShopAssistant shopAssistant1 = shopAssistants[0];
        ShopAssistant shopAssistant2 = shopAssistants[1];
        ShopAssistant shopAssistant3 = shopAssistants[2];

        AbstractDepartment[] departments = new AbstractDepartment[3];
        departments[0] = new KitchenAppliances("Техника для кухни", blenders, shopAssistant1);
        departments[1] = new LargeHomeAppliances("Крупная бытовая техника", fridges, shopAssistant2);
        departments[2] = new Laptops("Ноутбуки", laptops, shopAssistant3);

        Banker[] bankers = new Banker[2];
        bankers[0] = new Banker("ПриветБанк", "12мес.");
        bankers[1] = new Banker("БаблаБанк", "6мес.");
        Cashier[] cashiers = new Cashier[2];
        cashiers[0] = new Cashier();

        Security security = new Security();
        Customer person1 = new Customer("Мария");
        CustomerWithDiscount person2 = new CustomerWithDiscount("Игорь");

        Administration administration = new Administration(departments,products,shopAssistants);
        ShoppingRoom shoppingRoom = new ShoppingRoom(products,departments,bankers,security,cashiers,person1,person2);

        Shop shop = new Shop(shoppingRoom,administration);

        departments[0].TalkWithCustomer();
        shoppingRoom.BuyProduct();
        administration.FindAssistant();
        shop.getShoppingRoom().BuyProduct();
        shop.getAdministration().FindAssistant();
        shopAssistant1.GiveInfoAboutProducts(blenders);
        shoppingRoom.TalkWithBankers();
        shop.getShoppingRoom().departments[0].TalkWithCustomer();


    }
}

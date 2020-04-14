package OOP_SHOP.Customer;

import OOP_SHOP.Interfaces.Customer;
import OOP_SHOP.Products.AbstractProduct;

public abstract class AbstractCustomer implements Customer {
    private String name;
    public AbstractCustomer(String name){

        this.name = name;
    }
    public String getName()
    {
        return name;
    }

    @Override
    public void Buy(){
        System.out.println("Покупаю: ");
    }

    @Override
    public void ReturnProduct(){

        System.out.println("Хочу вернуть");
    }


}

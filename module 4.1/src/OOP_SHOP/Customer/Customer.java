package OOP_SHOP.Customer;

public class Customer extends AbstractCustomer{
    public Customer(String name){

        super(name);
    }

    public void giveMoney(){
        System.out.println("Ввод наличных: ");
    }
}

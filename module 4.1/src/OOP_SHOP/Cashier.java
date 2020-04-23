package OOP_SHOP;

public class Cashier {
    private String name;
    public Cashier(){

    }

    public void TakeMoney() {
        System.out.println("Спасибо за покупку! Не забудьте при выходе показать охраннику чек");
    }

    public String getName() {
        return name;
    }
}

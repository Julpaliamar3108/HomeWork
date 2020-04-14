package OOP_SHOP.Products;

public class Laptop extends AbstractProduct {
    private String diagonal;

    public Laptop(String productName, double price,String departmentName, String diagonal){
        super(productName, price, departmentName);
        this.diagonal = diagonal;
    }

    public String getDiagonal(){
        return diagonal;
    }
}

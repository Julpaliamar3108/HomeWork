package OOP_SHOP.Products;

public class Fridge extends AbstractProduct {
    private String color;
     public Fridge(String productName, double price, String departmentName, String color){
         super(productName, price, departmentName);
         this.color = color;
     }

     public String getColor(){
         return color;
     }
}

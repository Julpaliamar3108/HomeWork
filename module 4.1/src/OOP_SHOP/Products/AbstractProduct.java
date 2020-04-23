package OOP_SHOP.Products;

import OOP_SHOP.Interfaces.Product;

public abstract class AbstractProduct implements Product {
    private String productName;
    private double price;
    private String departmentName;

    public AbstractProduct(String productName, double price, String departmentName){
        this.productName = productName;
        this.price = price;
        this.departmentName = departmentName;
    }
    @Override
    public String getProductName(){
        return productName;
    }

    public double getPrice(){
        return price;
    }

    @Override
    public String getDepartmentName(){
        return departmentName;
    }

    @Override
    public String toString() {
       return productName + ", по цене " + price + "грн.";
   }
}

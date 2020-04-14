package OOP_SHOP.Departments;

import OOP_SHOP.Products.AbstractProduct;

public class Laptops extends AbstractDepartment{
    AbstractProduct[] laptops;

    public Laptops(String departmentName, AbstractProduct[] laptops){
        super(departmentName);
        this.laptops = laptops;
    }
}

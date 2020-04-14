package OOP_SHOP.Departments;

import OOP_SHOP.Products.AbstractProduct;

public class LargeHomeAppliances extends AbstractDepartment{
    AbstractProduct[] fridges;

    public LargeHomeAppliances(String departmentName, AbstractProduct[] fridges){
        super(departmentName);
        this.fridges = fridges;
    }
}

package OOP_SHOP.Departments;

import OOP_SHOP.Products.AbstractProduct;

public class KitchenAppliances extends AbstractDepartment {
    AbstractProduct[] blenders;

    public KitchenAppliances(String departmentName, AbstractProduct[] blenders){
        super(departmentName);
        this.blenders = blenders;
    }

    public AbstractProduct[] getBlenders() {
        return blenders;
    }
}

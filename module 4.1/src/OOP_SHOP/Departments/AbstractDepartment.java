package OOP_SHOP.Departments;

import OOP_SHOP.Interfaces.Department;
import OOP_SHOP.ShopAssistant;

public abstract class AbstractDepartment implements Department {
    private String departmentName;
    ShopAssistant shopAssistant;

    public AbstractDepartment(String departmentName, ShopAssistant shopAssistant)
    {
        this.departmentName = departmentName;
        this.shopAssistant = shopAssistant;
    }

    public AbstractDepartment() {

    }

    @Override
    public String getDepartmentName(){
         return departmentName;
     }

    public abstract void TalkWithCustomer();








}

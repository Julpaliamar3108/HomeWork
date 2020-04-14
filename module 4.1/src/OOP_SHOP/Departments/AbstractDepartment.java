package OOP_SHOP.Departments;

import OOP_SHOP.Interfaces.Department;

public abstract class AbstractDepartment implements Department {
    private String departmentName;
    //Product[] productList;

    public AbstractDepartment(String departmentName)
    {
        this.departmentName = departmentName;
    }
     @Override
    public String getDepartmentName(){
         return departmentName;
     }

}

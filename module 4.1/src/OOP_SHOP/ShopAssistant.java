package OOP_SHOP;

public class ShopAssistant {
    private String assistantName;
    private String departmentName;

    public ShopAssistant(String assistantName, String departmentName){
        this.assistantName = assistantName;
        this.departmentName = departmentName;
    }

    public void GiveInformationByPrice(){
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getAssistantName() {
        return assistantName;
    }

}

package OOP_SHOP;

public class Shop {
    private ShoppingRoom shoppingRoom;
    private Administration administration;

    public  Shop(ShoppingRoom shoppingRoom, Administration administration){
        this.shoppingRoom = shoppingRoom;
        this.administration = administration;
    }

    public ShoppingRoom getShoppingRoom() {
        return shoppingRoom;
    }

    public Administration getAdministration() {
        return administration;
    }
}

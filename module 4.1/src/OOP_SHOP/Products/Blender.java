package OOP_SHOP.Products;

public class Blender extends AbstractProduct {
    private int numberOfNuzzles;
    public Blender(String productName, double price, String departmentName, int numberOfNuzzles ){
        super(productName, price, departmentName );
        this.numberOfNuzzles = numberOfNuzzles;

    }
    public int getNumberOfNuzzles(){
        return numberOfNuzzles;
    }

    @Override
    public String toString() {
        return super.toString() + ", количество насадок: " + numberOfNuzzles;
    }
}

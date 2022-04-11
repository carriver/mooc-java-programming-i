
public class Product {

    private String name;
    private double price;
    private int qty;

    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.name = initialName;
        this.price = initialPrice;
        this.qty = initialQuantity;

    }

    public void printProduct() {
        System.out.println(name + ", price " + price + ", " + qty + "pcs");
    }
}

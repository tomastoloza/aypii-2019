package guide15;

import java.util.ArrayList;

public class ComboProduct extends Product {

    private ArrayList<Product> products = new ArrayList<>();


    public ComboProduct(String name, double price) {
        super(name, price);
    }


    public void addProductToCombo(Product products) {
        this.products.add(products);
    }


    public void addProduct(Product product) {
        this.products.add(product);
    }


    @Override
    public String toString() {
        return "Combo: " + this.getName() + " $ " + this.getPrice() + " Items: " + this.products.toString();
    }
}

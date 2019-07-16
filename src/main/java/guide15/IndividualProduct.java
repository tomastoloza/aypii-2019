package guide15;

public class IndividualProduct extends Product {

    public IndividualProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Producto: " + this.getName() + " $ " + this.getPrice();
    }
}

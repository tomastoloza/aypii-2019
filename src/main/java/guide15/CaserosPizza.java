package guide15;

import java.util.ArrayList;

/**
 * La pizzería “La Mejor de Caseros” vende productos individuales (p. ej. porción
 * de pizza, pizza enteras, gaseosa, porción de fainá) y también combos (p.ej:
 * Combo 1: 2 porciones de pizza + 1 porción de fainá + 1 gaseosa, etc.). Cada
 * producto individual tiene un precio y también cada combo tiene un precio. El
 * método imprimir menú de la pizzería tiene que mostrar los nombres y precios de
 * cada producto individual y también los nombres, componentes y precios de cada
 * combo.
 */
public class CaserosPizza {
    private ArrayList<Product> products = new ArrayList<>();

    public void displayProducts() {
        for (int i = 0; i < this.products.size(); i++) {
            System.out.println(i + ". " + this.products.get(i).toString() + "\n");
        }
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }


    public static void main(String[] args) {

        CaserosPizza caserosPizza = new CaserosPizza();
        IndividualProduct porcionDePizza = new IndividualProduct("Porcion de pizza", 20);
        IndividualProduct faina = new IndividualProduct("Porcion de faina", 10);
        ComboProduct pizzaYfaina = new ComboProduct("Porcion de pizza y faina", 25);

        caserosPizza.addProduct(porcionDePizza);
        caserosPizza.addProduct(faina);
        pizzaYfaina.addProduct(porcionDePizza);
        pizzaYfaina.addProduct(faina);
        caserosPizza.addProduct(pizzaYfaina);
        caserosPizza.displayProducts();

    }
}


import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        Product product1 = new Product(100, "Капучино");
        Product product2 = new Product(200, "Лате");
        Product product3 = new Product(300, "Мокачино");

        VendingMachine vMachin = new VendingMachine();

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);

        vMachin.initProducts(products);

        Product p = vMachin.getProduct("Мокачино");
        if (p !=null){
            System.out.println("Продукт найден: " + p.GetName() + ", Цена: " + p.GetCost());
        } else {
            System.out.println("Продукт не найден!");
        }
    }
}

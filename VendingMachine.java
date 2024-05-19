
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private List<Product> listProduct = new ArrayList<>();

    public void initProducts(List<Product> listProducts) {
        listProduct = listProducts;
    }

    public Product getProduct(String name) {
        for (Product product : listProduct) {
            if (product.GetName().equals(name)) {
                return product;
            }
        }

        return null;
    }
}

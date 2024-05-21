
import java.util.List;

// Интерфейс для торгового автомата
public interface VendingMachine {

    void initProducts(List<Product> products);

    Product getProduct(String name);
}


import java.util.List;

/**
 * Интерфейс для торгового автомата
 *
 * @author lex
 */
public interface VendingMachine {

    void initProducts(List<Product> products);

    Product getProduct(String name);
}

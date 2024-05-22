
import java.util.ArrayList;
import java.util.List;

public class HotDrinksMachine implements VendingMachine {

    // Список горячих напитков
    private final List<HotDrink> hotDrinks = new ArrayList<>();

    // Инициализация продуктов
    @Override
    public void initProducts(List<Product> products) {
        for (Product product : products) {
            if (product instanceof HotDrink hotDrink) {
                hotDrinks.add(hotDrink);
            }
        }
    }

    // Получение продукта по имени
    @Override
    public Product getProduct(String name) {
        for (HotDrink hotDrink : hotDrinks) {
            if (hotDrink.getName().equals(name)) {
                return hotDrink;
            }
        }
        return null;
    }

    /**
     * Перегруженный метод для получения продукта по имени, объему и температуре
     *
     * @param name
     * @param volume
     * @param temperature
     * @return
     */
    public HotDrink getProduct(String name, int volume, int temperature) {
        for (HotDrink hotDrink : hotDrinks) {
            if (hotDrink.getName().equals(name) && hotDrink.getCost() == volume && hotDrink.getTemperature() == temperature) {
                return hotDrink;
            }
        }
        return null;
    }
}

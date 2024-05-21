
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Создание горячих напитков
        HotDrink drink1 = new HotDrink(100, "Капучино", 70);
        HotDrink drink2 = new HotDrink(200, "Лате", 75);
        HotDrink drink3 = new HotDrink(300, "Мокачино", 80);

        // Создание торгового автомата для горячих напитков
        HotDrinksMachine hotDrinksMachine = new HotDrinksMachine();

        // Инициализация списка продуктов
        List<Product> products = new ArrayList<>();
        products.add(drink1);
        products.add(drink2);
        products.add(drink3);

        // Инициализация продуктов в торговом автомате
        hotDrinksMachine.initProducts(products);

        // Получение продукта по имени
        Product p1 = hotDrinksMachine.getProduct("Мокачино");
        if (p1 != null) {
            System.out.println("Продукт найден: " + p1.getName() + ", Цена: " + p1.getCost());
        } else {
            System.out.println("Продукт не найден!");
        }

        // Получение горячего напитка по имени, объему и температуре
        HotDrink p2 = hotDrinksMachine.getProduct("Лате", 200, 75);
        if (p2 != null) {
            System.out.println("Горячий напиток найден: " + p2.getName() + ", Цена: " + p2.getCost() + ", Температура: " + p2.getTemperature());
        } else {
            System.out.println("Горячий напиток не найден!");
        }
    }
}

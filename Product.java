
/**
 * Класс продукт
 *
 * @author lex
 */

public class Product {

    // Поля стоимости и названия продукта
    private int cost;
    private String name;

    /**
     * Конструктор класса Produck
     *
     * @param cost поле стоимость
     * @param name поле название
     */
    public Product(int cost, String name) {
        this.cost = cost;
        this.name = name;
    }

    /**
     * Геттер для стоимость
     *
     * @return Возвращает стоимость продукта
     */
    public int getCost() {
        return cost;
    }

    /**
     * Геттер для названия
     *
     * @return Возвращает название продукта
     */
    public String getName() {
        return name;
    }

    // Сеттер для стоимости
    public void setCost(int cost) {
        this.cost = cost;
    }

    // Сеттер для названия
    public void setName(String name) {
        this.name = name;
    }
}

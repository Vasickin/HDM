
public class Product {

    // Поля стоимости и названия продукта
    private int cost;
    private String name;

    // Конструктор класса Product
    public Product(int cost, String name) {
        this.cost = cost;
        this.name = name;
    }

    // Геттер для стоимости
    public int getCost() {
        return cost;
    }

    // Геттер для названия
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


public class HotDrink extends Product {

    // Дополнительное поле температуры для горячих напитков
    private int temperature;

    // Конструктор класса HotDrink
    public HotDrink(int cost, String name, int temperature) {
        super(cost, name);
        this.temperature = temperature;
    }

    // Геттер для температуры
    public int getTemperature() {
        return temperature;
    }

    // Сеттер для температуры
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}

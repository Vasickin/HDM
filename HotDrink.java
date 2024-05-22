
/**
 * Класс HotDrink
 *
 * @author lex
 */
public class HotDrink extends Product {

    /**
     * Дополнительное поле температуры для горячих напитков
     */
    private int temperature;

    /**
     * Конструктор класса HotDrink
     *
     * @param cost
     * @param name
     * @param temperature
     */
    public HotDrink(int cost, String name, int temperature) {
        super(cost, name);
        this.temperature = temperature;
    }

    /**
     * Геттер для температуры
     *
     * @return
     */
    public int getTemperature() {
        return temperature;
    }

    /**
     * Сеттер для температуры
     *
     * @param temperature
     */
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}

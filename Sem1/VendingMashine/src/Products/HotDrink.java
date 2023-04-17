package Products;

public class HotDrink extends Product {
    /* Задали дополнительную переменную - температуру */
    private int temperature;
    /* Задали объем напитка */
    private int volume;

    public HotDrink(String name, double price, int temperature, int volume) {
        super(name, price);
        this.temperature = temperature;
        this.volume = volume;
    }

    /* Получаем температуру напитка */
    public int getTemperature() {
        return temperature;
    }

    /* Получаем объем напитка */
    public int getVolume() {
        return volume;
    }

    /* Устанавливаем объем напитка */
    public void setVolume(int volume) {
        this.volume = volume;
    }

    /* Устанавливаем тепературу напитка */
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    /* определяем метод стринг */
    @Override
    public String toString() {
        return "Product{" +
                "name='" + super.getName() + '\'' +
                ", cost=" + super.getPrice() +
                ", volume=" + volume +
                ", temperature=" + temperature +
                '}';
    }

}

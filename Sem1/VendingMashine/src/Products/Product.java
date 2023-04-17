package Products;

public class Product {
    /** наименование продукта */
    private String name;
    /** цена продукта */
    private Double price;

    /**
     * конструктор продукта 2 параметра
     */
    public Product(String name, Double price) {
        if (name == "") {
            throw new IllegalStateException(String.format("Цена указана некорректно!", price));
        } else {
            this.name = name;
            this.price = price;
        }
    }

    /**
     * конструктор продукта 1 параметр
     */
    public Product(String name) {
        this.name = name;
    }

    /** получаем наименование продукта */
    public String getName() {
        return name;
    }

    /** получаем цену продукта */
    public Double getPrice() {
        return price;
    }

    /**
     * устанавливаем цену продукта
     * 
     * @param value новая цена продукта
     */
    public void setPrice(Double value) {
        if (value <= 0) {
            throw new IllegalStateException(String.format("Цена указана некорректно!", value));
            // return;
        }
        this.price = value;
    }

    /**
     * переопределение вывода продукта
     */
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + price +
                '}';
    }
}

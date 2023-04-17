import Products.BottleOfWater;
import Products.HotDrink;
import Products.Product;
import VendingMachines.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {

        Product item1 = new Product("Cola", 88.0);
        item1.setPrice(98.0);

        VendingMachine itemMachin = new VendingMachine(300);
        /* добавляем в автомат продукты */
        itemMachin.addProduct(item1);
        itemMachin.addProduct(new Product("Чипсы", 60.0));
        itemMachin.addProduct(new Product("Масло", 50.0));
        itemMachin.addProduct(new Product("Хлеб", 40.0));
        itemMachin.addProduct(new Product("Снек", 20.0));
        itemMachin.addProduct(new BottleOfWater("Вода", 88.0, 1));
        itemMachin.addProduct(new BottleOfWater("Кола", 56.0, 1));
        itemMachin.addProduct(new HotDrink("Американо", 100, 90, 1));
        itemMachin.addProduct(new HotDrink("Капучино", 150, 80, 1));
        itemMachin.addProduct(new HotDrink("Черный чай", 80, 80, 1));
        itemMachin.addProduct(new HotDrink("Зеленый чай", 80, 80, 1));
        for (Product prod : itemMachin.getProdAll()) {
            System.out.println(prod.toString());
        }

    }
}
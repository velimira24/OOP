package StudentService;

import java.util.List;

public class AverageAge<T extends iGetAge> {
    private List<T> list1;

    /* конструктор */
    public AverageAge(List<T> list1) {
        this.list1 = list1;
    }

    /* считаем средний возраст */
    public double AverageAgeMean() {
        int sum = 0;
        int age = 0;
        for (T index : list1) {
            age = index.getAge();
            sum = sum + index.getAge();
        }
        return (double) sum / list1.size();
    }

    /* вывод в печать */
    @Override
    public String toString() {
        return "Средний возраст равен: " + (String.format("%.2f", AverageAgeMean()));
    }

}

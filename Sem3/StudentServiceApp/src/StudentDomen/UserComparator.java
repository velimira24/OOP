package StudentDomen;

import java.util.Comparator;

/*класс сравнения представителей определенного класса (в данном случае - User) */
public class UserComparator<T extends User> implements Comparator<T> {

    @Override
    /* сравнение о1 и о2 */
    public int compare(T o1, T o2) {
        /* результат сравнения по имени */
        int resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
        /* если имена одинаковые */
        if (resultOfComparing == 0) {
            /* сравниваем фамилии */
            resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());
            /* возвращаем результат */
            return resultOfComparing;
            /* если имена одинаковые, то возвращаем результат по сравнению имен */
        } else {
            return resultOfComparing;
        }
    }

}
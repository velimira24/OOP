package StudentDomen;

import java.util.Iterator;
import java.util.List;

/*подключаем перечислитель */
public class StudentSteamIterator implements Iterator<StudentGroup> {
    /* счетчик */
    private int counter;
    /* список, который он будет оперировать */
    private final List<StudentGroup> steam;

    /* конструктор */
    public StudentSteamIterator(List<StudentGroup> steam) {
        this.steam = steam;
        /* счетчик начинаем с нуля */
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        /* указываем, что счетчик возвращается, пока он меньше размера студентов */
        return counter < steam.size();
    }

    @Override

    public StudentGroup next() {
        /* если метод hasNext возвращает ложное значение, то возвращаем ноль */
        if (!hasNext()) {
            return null;
        }
        /* добавляем счетчик */
        return steam.get(counter++);
    }

}
package StudentDomen;

import java.util.Iterator;
import java.util.List;

/*подключаем перечислитель */
public class StudentGroupIterator implements Iterator<Student> {
    /* счетчик */
    private int counter;
    /* список, который он будет оперировать */
    private final List<Student> students;

    /* конструктор */
    public StudentGroupIterator(List<Student> students) {
        this.students = students;
        /* счетчик начинаем с нуля */
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        /* указываем, что счетчик возвращается, пока он меньше размера студентов */
        return counter < students.size();
    }

    @Override
    public Student next() {
        /* если метод hasNext возвращает ложное значение, то возвращаем ноль */
        if (!hasNext()) {
            return null;
        }
        /* добавляем счетчик */
        return students.get(counter++);
    }

}
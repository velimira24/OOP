package StudentDomen;

import java.util.Iterator;
import java.util.List;

/*добавляем итератор и сравниватель */
public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    /* создаем список студентов */
    private List<Student> students;
    private long groupID;
    private int numberOfStudents;

    /* Создаем конструктор, добавляем айди группы и количество студентов в группе */
    public StudentGroup(List<Student> students, long groupID, int numberOfStudents) {
        this.students = students;
        this.groupID = groupID;
        this.numberOfStudents = numberOfStudents;
    }

    public long getGroupID() {
        return groupID;
    }

    public void setGroupID(long groupID) {
        this.groupID = groupID;
    }

    /* геттер */
    public List<Student> getStudents() {
        return students;
    }

    /* сеттер */
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    @Override
    /* итеррирование* */
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(students);
    }

    @Override
    /* вывод на экран */
    public String toString() {
        return "StudentGroup{" + "GroupID = " + getGroupID()

                + ". Members of this group" + getStudents() +
                '}';

    }

    @Override
    /* метод сравнения */
    public int compareTo(StudentGroup o) {
        /* сортируем по количеству студентов в группе */
        if (getNumberOfStudents() == o.getNumberOfStudents()) {
            /* если одно равно другому, то возвращаем ноль */
            if (this.groupID == o.groupID) {
                return 0;
            }
            /* если новый студент айди меньше исходного */
            if (this.groupID < o.groupID) {
                return -1;
            }
            return 1;
        }
        if (getNumberOfStudents() < o.getNumberOfStudents()) {
            return -1;
        }
        return 1;
    }
}
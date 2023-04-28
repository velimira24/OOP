package StudentDomen;

import StudentService.iGetAge;

/*Студент наследует класс юзера (информационные поля) */
public class Student extends User implements Comparable<Student>, iGetAge {
    /* добавляется новое поле */
    private long studentID;
    /* Конструктор: вызывается информация родителя + добавляется поле с айди */

    public Student(String firstName, String secondName, int age, long studentID) {
        /* задаем информацию родительского класса (супер): имя, фамилию, возраст */
        super(firstName, secondName, age);
        /* задаем айди */
        this.studentID = studentID;
    }

    /* геттер айди */
    public long getStudentID() {
        return studentID;
    }

    /* сеттер айди */
    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    @Override
    /* вывод на экран */
    public String toString() {
        return "Student{"

                + "firstName=" + super.getFirstName()
                + ", secondName=" + super.getSecondName()
                + ", age=" + super.getAge() +
                ", studentID=" + studentID +
                '}';

    }

    @Override
    /* метод сравнения */
    public int compareTo(Student o) {
        /* вывод на экран того, как работает сортировщик */
        // System.out.println(super.getFirstName() + " - " + o.getFirstName());
        /* сортируем по возрасту */
        if (super.getAge() == o.getAge()) {
            /* если одно равно другому, то возвращаем ноль */
            if (this.studentID == o.studentID) {
                return 0;
            }
            /* если новый студент айди меньше исходного */
            if (this.studentID < o.studentID) {
                return -1;
            }
            return 1;
        }
        if (super.getAge() < o.getAge()) {
            return -1;
        }
        return 1;
    }

    /* подключаем интерфейс вызова возраста */
    @Override
    public int getAge() {
        return super.getAge();
    }

}

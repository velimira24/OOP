package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Student;

public class StudentService implements iUserService<Student> {
    /* внутренняя переменная = счетчик */
    private int count;
    /* список студентов */
    private List<Student> students;

    /* конструктор */
    public StudentService() {
        this.students = new ArrayList<Student>(null);
    }

    @Override
    public void create(String firstName, String secondName, int age) {
        Student per = new Student(firstName, secondName, age, count);
        count++;
        students.add(per);
    }

    @Override
    /* выводим студентов через айюзер сервис */
    public List<Student> getAll() {
        return students;
    }

    /*
     * выводим всех студентов сами
     * public List<Student> getAll() {
     * return students;
     * }
     */

}

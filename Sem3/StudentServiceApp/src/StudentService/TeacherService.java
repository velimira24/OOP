
package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Teacher;
import StudentDomen.UserComparator;

public class TeacherService implements iUserService<Teacher> {
    /* счетчик/ */
    private int count;
    /*
     * добавляем болванку вместо ученой степени учителя, чтобы дальше не было
     * проблем с выводом
     */
    private String deg;
    /* внутренний список */
    private List<Teacher> teachers;

    /* конструктор */
    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }

    /* подключаем к айюзер сервису */
    @Override
    public void create(String firstName, String secondName, int age) {
        Teacher person = new Teacher(firstName, secondName, age, count, deg);
        count++;
        teachers.add(person);
    }

    /* выводим всех список через айюзер сервис */
    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    public List<Teacher> getSortedByFIOTeacher(int numberGroup) {
        List<Teacher> teach = new ArrayList<>(teachers);
        teach.sort(new UserComparator<Teacher>());
        return teach;
    }
}

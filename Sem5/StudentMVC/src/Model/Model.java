package Model;

import java.util.List;
import Controller.iGetModel;

/*подключаем айгетмодел */
public class Model implements iGetModel {
    private List<Student> students;
    private List<Student> studentsEng;

    /* конструктор */
    public Model(List<Student> students) {
        this.students = students;

    }

    /* создали метод, который покажет всех студентов */
    public List<Student> getAllStudent() {
        return students;
    }

    /* Для английского списка метод, который покажет всех студентов */
    public List<Student> getAllStudentEng() {
        return students;
    }

}

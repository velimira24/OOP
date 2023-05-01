package Controller;

import java.util.List;
import Model.Student;

public interface iGetView {
    /* один метод - это отображать студентов */
    void printAllStudent(List<Student> students);

    void printAllStudentEng(List<Student> studentsEng);

    /* добавили в интерфейс возможность вывода команд */
    String prompt(String message);
}
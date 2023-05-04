package Controller;

import java.util.HashMap;
import Model.Student;

public interface iGetView {
    /* один метод - это отображать студентов */

    void printAllStudent(HashMap<Long, Student> students);

    void printAllStudentEng(HashMap<Long, Student> studentsEng);

    /* добавили в интерфейс возможность вывода команд */
    String prompt(String message);
}
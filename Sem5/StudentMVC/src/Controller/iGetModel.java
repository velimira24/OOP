package Controller;

import java.util.List;
import Model.Student;

public interface iGetModel {
    /*
     * один метод - геттер студентовб аналогично далее вывдим список на английском
     */
    public List<Student> getAllStudent();

    public List<Student> getAllStudentEng();

}
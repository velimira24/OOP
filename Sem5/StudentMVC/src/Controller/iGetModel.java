package Controller;

import java.util.HashMap;
import Model.Student;

public interface iGetModel {
    /*
     * один метод - геттер студентов аналогично далее выводим список на английском
     */
    public HashMap<Long, Student> getAllStudent();

    public HashMap<Long, Student> getAllStudentEng();

    public HashMap<Long, Student> deleteStudent();/*
                                                   * сразу тут прописываем, что n
                                                   * заданная переменная, а то в модел будет отражаться ошибка,
                                                   * если здесь пустые скобки будут
                                                   */

}
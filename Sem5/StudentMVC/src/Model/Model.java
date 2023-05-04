package Model;

import java.util.HashMap;

import Controller.iGetModel;

public class Model implements iGetModel {

    private HashMap<Long, Student> students;

    public Model(HashMap<Long, Student> students) {
        this.students = students;
    }

    /* выводим всех студентов */
    public HashMap<Long, Student> getAllStudent() {
        return students;
    }

    @Override
    public HashMap<Long, Student> getAllStudentEng() {
        return students;
    }

    @Override
    public HashMap<Long, Student> deleteStudent() {
        return students;
    }

}
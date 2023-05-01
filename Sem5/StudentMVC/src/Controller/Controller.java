package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.Student;

public class Controller {

    private List<Student> students;
    private iGetView view;
    private iGetModel model;

    public Controller(iGetView view, iGetModel model) {
        this.view = view;
        this.model = model;
        /* ввели список студентов */
        this.students = new ArrayList<Student>();
    }

    public void getAllStudent() {
        students = model.getAllStudent();
    }

    /* проверяем, есть ли студенты в списке еще */
    public boolean testData() {
        if (students.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void updateView() {
        // MVP модель
        getAllStudent();
        if (testData()) {
            view.printAllStudent(students);
        } else {
            System.out.println("Список студентов пуст!");
        }

        // MVC
        // view.printAllStudent(model.getAllStudent());
    }

    ///

    public void getAllStudentEng() {
        students = model.getAllStudentEng();
    }

    public void updateViewEng() {
        // MVP модель
        getAllStudentEng();
        if (testData()) {
            view.printAllStudentEng(students);
        } else {
            System.out.println("The list is emppty!");
        }

        // MVC
        // view.printAllStudent(model.getAllStudent());
    }

    ////

    /* метод, который будет перехватывать команды */
    public void run() {
        /*
         * список команд, команда - ничего не делать
         */
        Commands com = Commands.NONE;
        /* бесконечная операция */
        boolean getNewIteration = true;
        /* проверяем состояние переменной */
        while (getNewIteration) {
            /* команды под пользователя */
            String command = view.prompt("Введите команду:");
            /* получаем команды пользователя, добавили, чтобы большими буквами */
            com = Commands.valueOf(command.toUpperCase());
            switch (com) {
                /* если пошла команда екзит, то выходим из программы */
                case EXIT:
                    getNewIteration = false;
                    System.out.println("Выход из программы!");
                    break;
                /* вывести всех студентов */
                case LIST:
                    /* получили от модели студентов */
                    // getAllStudent();
                    /* вывели через контроллер */
                    updateView();
                    break;
                case LISTENG:
                    updateViewEng();
                    break;
            }

        }

    }

}
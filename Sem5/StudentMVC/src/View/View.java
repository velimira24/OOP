package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

/*подключаем интерфейс айгетмодел */
public class View implements iGetView {
    public void printAllStudent(List<Student> students) {
        System.out.println("-----Вывод списка студентов-----");
        for (Student person : students) {
            System.out.println(person);
        }
        System.out.println("-----Конец списка-----");
    }

    /* метод вывода команд с консоли */
    public String prompt(String message) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print(message);
            return in.nextLine();
        }
    }

    @Override
    public void printAllStudentEng(List<Student> students) {
        System.out.println("Попробуйте ввести LIST");
    }

}
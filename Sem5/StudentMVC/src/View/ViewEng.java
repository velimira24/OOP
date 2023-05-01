package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

/*подключаем интерфейс ай-гет-модел */
public class ViewEng implements iGetView {
    public void printAllStudentEng(List<Student> students) {
        System.out.println("-----List of Students-----");
        for (Student person : students) {
            System.out.println(person);

        }
        System.out.println("-----The end----");
    }

    /* метод вывода команд с консоли */
    public String prompt(String message) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print(message);
            return scan.nextLine();
        }
    }

    @Override
    public void printAllStudent(List<Student> students) {
        System.out.println("Please try LISTENG");
    }

}

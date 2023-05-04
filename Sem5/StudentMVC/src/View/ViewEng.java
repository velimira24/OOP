package View;

import java.util.HashMap;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

/*подключаем интерфейс ай-гет-модел */
public class ViewEng implements iGetView {
    public void printAllStudentEng(HashMap<Long, Student> students) {
        System.out.println("-----List of Students-----");
        for (HashMap.Entry<Long, Student> set : students.entrySet()) {

            System.out.println(set.getKey() + " = "
                    + set.getValue());
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
    public void printAllStudent(HashMap<Long, Student> students) {
        System.out.println("Please try LISTENG");
    }

}

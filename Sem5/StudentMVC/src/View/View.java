package View;

import java.util.HashMap;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

/*подключаем интерфейс айгетмодел */
public class View implements iGetView {
    public void printAllStudent(HashMap<Long, Student> students)

    {
        System.out.println("-----Список студентов-----");
        for (HashMap.Entry<Long, Student> set : students.entrySet()) {

            /* вывод всех студентов */
            System.out.println(set.getKey() + " = "
                    + set.getValue());
        }
        // for(Long person : students.get(person))
        // {
        // System.out.println(person);
        // }
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
    public void printAllStudentEng(HashMap<Long, Student> students) {
        System.out.println("Попробуйте ввести LIST");
    }

}

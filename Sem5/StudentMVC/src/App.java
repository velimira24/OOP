
import java.util.HashMap;
import java.util.Scanner;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.Model;
import Model.Student;
import View.View;
import View.ViewEng;

public class App {
    public static void main(String[] args) throws Exception {
        /* создали {Хэшмэп студентов, чтобы посмотреть, работает ли он */
        HashMap<Long, Student> students = new HashMap<Long, Student>();
        Student s1 = new Student("Сергей", "Иванов", 21, (long) 101);
        Student s2 = new Student("Андрей", "Сидоров", 22, (long) 111);
        Student s3 = new Student("Иван", "Петров", 22, (long) 121);
        Student s4 = new Student("Игорь", "Иванов", 23, (long) 301);
        Student s5 = new Student("Даша", "Цветкова", 25, (long) 171);
        Student s6 = new Student("Лена", "Незабудкина", 23, (long) 104);
        students.put((long) 1, s1);
        students.put((long) 2, s2);
        students.put((long) 3, s3);
        students.put((long) 4, s4);
        students.put((long) 5, s5);
        students.put((long) 6, s6);

        // создали hashmap, чтобы посмотреть, а заработает ли он
        HashMap<Long, Student> students1 = new HashMap<Long, Student>();
        students1.put((long) 111, s1);
        students1.put((long) 222, s2);

        /* Чтобы подключить файл-репо, надо создать экземпляр файлрепо */
        // FileRepo fileRepo = new FileRepo("StudentDb.txt");
        /*
         * for (Student pers : students) {/ вызов студентов /
         * fileRepo.addStudent(pers);
         * } / сохранение студентов /
         * fileRepo.saveAllStudentToFile();
         */
        /*
         * выводим список HashMap, который подключили в Model, чтобы посмотреть,
         * работает ли
         */
        System.out.println("Вывод списка HashMap");
        System.out.println(students1);
        /* закончили выводить список */
        // iGetModel modelFileRepo = fileRepo;
        iGetModel model = new Model(students);
        /* Подключаем viewEng, чтобы посмотреть, как он заработает */
        iGetView view = new View();
        /* смотрим работу через репозиторий */
        // Controller control = new Controller(view, fileRepo);
        /* Смотрим, как работает через модель */
        Controller control1 = new Controller(view, model);

        control1.run();
        /* control.updateView(); */

    }
}
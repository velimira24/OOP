import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentSteam;
import StudentDomen.User;
import StudentDomen.Teacher;

public class App {
    public static void main(String[] args) throws Exception {
        /* создаем юзера */
        User u1 = new User("Сергей", "Иванов", 25);
        /* создаем студентов */
        Student s1 = new Student("Сергей", "Иванов", 25, 101);
        Student s2 = new Student("Дмитрий", "Хватиков", 23, 102);
        Student s3 = new Student("Анна", "Соколова", 24, 103);
        Student s4 = new Student("Иван", "Волков", 22, 104);
        Student s5 = new Student("Мария", "Сиротина", 24, 105);
        Student s6 = new Student("Елена", "Красная", 25, 106);
        Student s7 = new Student("Павел", "Пак", 25, 101);
        Student s8 = new Student("Алексей", "Соловьев", 23, 102);
        Student s9 = new Student("Екатерина", "Соколова", 24, 103);
        Student s10 = new Student("Михаил", "Воронов", 22, 104);
        Student s11 = new Student("Марина", "Сиротина", 24, 105);
        Student s12 = new Student("Ольга", "Цветкова", 25, 106);
        Student s13 = new Student("Платон", "Сидоров", 25, 101);
        Student s14 = new Student("Прокопий", "Соловьев", 23, 102);
        Student s15 = new Student("Алина", "Сокальская", 24, 103);
        Student s16 = new Student("Петр", "Найденко", 22, 104);
        Student s17 = new Student("Марианна", "Незабудкина", 24, 105);
        Student s18 = new Student("Милена", "Зеленая", 25, 106);
        /* создаем учителя */
        Teacher t1 = new Teacher("Василий", "Курочкин", 40, 134, "English", 502);
        /* создаем список студентов */
        List<Student> listStud = new ArrayList<Student>();
        /* добавляем студентов */
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);
        List<Student> listStud2 = new ArrayList<Student>();
        /* добавляем студентов */
        listStud2.add(s7);
        listStud2.add(s8);
        listStud2.add(s9);
        listStud2.add(s10);

        List<Student> listStud3 = new ArrayList<Student>();
        /* добавляем студентов */
        listStud3.add(s11);
        listStud3.add(s12);
        listStud3.add(s13);
        listStud3.add(s14);
        listStud3.add(s15);

        List<Student> listStud4 = new ArrayList<Student>();
        /* добавляем студентов */
        listStud4.add(s16);
        listStud4.add(s17);
        listStud4.add(s18);

        /* создаем группу студентов */
        StudentGroup group = new StudentGroup(listStud, 1, 6);
        for (Student stud : group) {
            System.out.println(stud);
        }

        /* строка, чтобы было понятно, где до, а где после сортировки */
        System.out.println("============= после сортировки =============");
        Collections.sort(group.getStudents());
        for (Student stud : group) {
            System.out.println(stud);
        }

        /* выводим на экран созданных персонажей построчно u1,s1,t1... */
        System.out.println(u1);
        System.out.println(s1);
        System.out.println(t1);

        /* создаем еще группу студентов, чтобы можно было добавить в поток */
        StudentGroup group2 = new StudentGroup(listStud2, 2, 4);
        StudentGroup group3 = new StudentGroup(listStud3, 3, 5);
        StudentGroup group4 = new StudentGroup(listStud4, 4, 3);

        List<StudentGroup> listSteam1 = new ArrayList<StudentGroup>();
        listSteam1.add(group);
        listSteam1.add(group2);
        listSteam1.add(group3);
        listSteam1.add(group4);

        /* строка, чтобы было понятно, что это уже пошел вывод групп */
        System.out.println("============= выводим группы со списком студентов =============");

        /* создаем поток студентов, в скобках указываем номер потока */
        StudentSteam steam = new StudentSteam(listSteam1, 2);
        for (StudentGroup groupsOfSteam : steam) {
            System.out.println(groupsOfSteam);
        }
        /* строка, чтобы было понятно, где до, а где после сортировки */
        System.out.println("После сортировки по возрастанию количества студентов в группе:");
        Collections.sort(steam.getSteam());
        for (StudentGroup groupsOfSteam : steam) {
            System.out.println(groupsOfSteam);
        }
    }
}

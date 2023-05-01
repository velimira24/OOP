package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import Controller.iGetModel;

/*назвали, сокращенно от репозитория, имплементировали айгет модел*/
public class FileRepo implements iGetModel {
    private String fileName;
    private List<Student> students;
    private List<Student> studentsEng;

    /* конструктор */
    public FileRepo(String fileName) {
        this.fileName = fileName;
        this.students = new ArrayList<>();
        this.studentsEng = new ArrayList<>();
        /* проверяем, можем ли получить доступ */
        /* FileWrite - временная переменная */
        try (FileWriter fw = new FileWriter(fileName, true)) {
            /* если откроется, то закроем его и скинем данные в него */
            fw.flush();
        }
        /* если произойдет ошибка, то найдем её и выведет её */
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /* метод добавления студентов. Он принимает студентов и кладет их в хранилище */
    public void addStudent(Student student) {
        this.students.add(student);
    }

    /* метод добавления студентов в список на английском. */
    public void addStudentEng(Student studentEng) {
        this.students.add(studentEng);
    }

    /*
     * метод по работе с фаилом. Метод - где будут читать ин-фу
     * Он читает с жесткого диска
     */
    public void readAllStudentsFromFile() {
        try {
            /* создаем новый файл */
            File file = new File(fileName);
            /* нужен файлридер */
            FileReader fr = new FileReader(file);
            /* буффетридер, чтобы считать файлридер */
            BufferedReader reader = new BufferedReader(fr);
            /* считываем данные построчно */
            String line = reader.readLine();
            /* проверка */
            while (line != null) {
                /* разделителем сделаем пробел */
                String[] param = line.split(" ");
                /* создаем студента. в нулевой ячейке имя, дальше фамилияб дальше - парсе */
                Student pers = new Student(param[0], param[1], Integer.parseInt(param[2]), Long.parseLong(param[3]));
                students.add(pers);
                studentsEng.add(pers);
                /* считать строчку */
                line = reader.readLine();
            }
            /* если произойдет ошибка, чтобы могли её найти */
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /* метод, который сохраняет студентов в файл, начало повторяет предыдущий код */
    public void saveAllStudentToFile() {
        try (FileWriter fw = new FileWriter(fileName, true)) {
            for (Student pers : students) {
                /* собираем строчку */
                fw.write(pers.getFirstName() + " " + pers.getSecondName() + " " + pers.getAge() + " "
                        + pers.getStudentID());
                /* файл перевода строки */
                fw.append('\n');
            }
            fw.flush();
            /* ищем ошибку */
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /* чтобы прошла имплементация (её строчка наверху) */
    @Override
    public List<Student> getAllStudent() {
        /* выгрузили студентов */
        readAllStudentsFromFile();
        /* вернули студентов */
        return students;
    }

    /* чтобы имплементировать список студентов на английском языке */
    @Override
    public List<Student> getAllStudentEng() {
        /* выгрузили студентов */
        readAllStudentsFromFile();
        /* вернули студентов */
        return students;
    }

}
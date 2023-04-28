package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.UserComparator;

public class StudentGroupService {
    /* частный лист студенческих групп */
    private List<StudentGroup> groups;

    /* конструктор */
    public StudentGroupService() {
        /* создаем список */
        this.groups = new ArrayList<>();
    }

    /* создаем метод вывода всех групп */
    public List<StudentGroup> getAll() {
        return this.groups;
    }

    /* подключаем компаратор */
    public List<Student> getSortedByFIOStudentGroup(int numberGroup) {
        List<Student> students = new ArrayList<>(groups.get(numberGroup).getStudents());
        students.sort(new UserComparator<Student>());
        return students;
    }
}

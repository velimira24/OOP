package Controllers;

import StudentDomen.Teacher;
import StudentService.TeacherService;

/*добавляем класс контроля, который включает в себя интерфейс контроля юзера */
public class TeacherController implements iUserController<Teacher> {
    private final TeacherService dataService = new TeacherService();

    @Override
    public void create(String firstName, String secondName, int age) {
        dataService.create(firstName, secondName, age);
    }

}

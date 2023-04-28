package Controllers;

import StudentDomen.Emploee;
import StudentDomen.User;
import StudentService.EmploeeService;

public class EmploeeController implements iUserController<Emploee> {
    private final EmploeeService empService = new EmploeeService();

    @Override
    public void create(String firstName, String secondName, int age) {
        empService.create(firstName, secondName, age);
    }

    /*
     * пишем static, чтобы метод стал универсальным и к нему можно было обратиться
     * из любых программ; ограничили рабочим эту программу, чтобы случайно не
     * выплатить зарплату, например, студенту
     */
    static public <T extends Emploee> void paySalary(T person) {
        System.out.println(((User) person).getFirstName() + " зп 10000р ");
    }

    /*
     * пишем static, чтобы метод стал универсальным и к нему можно было обратиться
     * из любых программ
     */
    static public <T extends Number> Double mean(T[] num) {
        double sum = 0.0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i].doubleValue();
        }
        sum = sum / num.length;
        return sum;
    }
}
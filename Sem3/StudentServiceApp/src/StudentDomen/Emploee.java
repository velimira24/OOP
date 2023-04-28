package StudentDomen;

import StudentService.iGetAge;

public class Emploee extends User implements iGetAge {
    /* добавляем айди */
    private int empId;

    /* конструктор */
    public Emploee(String firstName, String secondName, int age, int empId) {
        /* супер - ссылка на класс User */
        super(firstName, secondName, age);
        this.empId = empId;
    }

    /* геттер айди */
    public int getEmpId() {
        return empId;
    }

    /* сеттер айди */
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    /* подключаем интерфейс вызова возраста */
    @Override
    public int getAge() {
        return super.getAge();
    }

}
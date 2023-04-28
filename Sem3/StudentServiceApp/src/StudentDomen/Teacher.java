package StudentDomen;

import StudentService.iGetAge;

public class Teacher extends User implements iGetAge {
    /* добавляем айди */
    private int teacerId;
    /* добавляем ученую степень */
    private String academicDegree;

    public Teacher(String firstName, String secondName, int age, int teacerId, String academicDegree) {
        super(firstName, secondName, age);
        this.teacerId = teacerId;
        this.academicDegree = academicDegree;
    }

    /* геттер */
    public int getTeacerId() {
        return teacerId;
    }

    /* сеттер */
    public void setTeacerId(int teacerId) {
        this.teacerId = teacerId;
    }

    /* геттар ученой степени */
    public String getLevel() {
        return academicDegree;
    }

    /* сеттер ученой степени */
    public void setLevel(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    /* подключаем интерфейс вызова возраста */
    @Override
    public int getAge() {
        return super.getAge();
    }

}
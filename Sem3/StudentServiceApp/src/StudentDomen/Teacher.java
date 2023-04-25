package StudentDomen;

/*класс учителя наследует класс юзера */
public class Teacher extends User {
    /* вводим учителя айди */
    private long teacherID;
    /* вводим учителя предмет */
    private String subject;
    /* вводим учителя номер кабинета */
    private int classroom;
    /* Конструктор: вызывается информация родителя + добавляется поле с айди */

    public Teacher(String firstName, String secondName, int age, long teacherID, String subject, int classroom) {
        /* задаем информацию родительского класса (супер): имя, фамилию, возраст */
        super(firstName, secondName, age);
        /* задаем айди */
        this.teacherID = teacherID;
        /* задаем предмет */
        this.subject = subject;
        /* задаем номер комнаты */
        this.classroom = classroom;
    }

    /* геттер айди */
    public long getTeacherID() {
        return teacherID;
    }

    /* сеттер айди */
    public void setTeacherID(long teacherID) {
        this.teacherID = teacherID;
    }

    /* геттер предмета */
    public String getSubject() {
        return subject;
    }

    /* сеттер предмета */
    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    /* геттер номера класса */
    public int getClassroom() {
        return classroom;
    }

    /* сеттер номера класса */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    /* вывод на экран */
    public String toString() {
        return "Student{"

                + "firstName=" + super.getFirstName()
                + ", secondName=" + super.getSecondName()
                + ", age=" + super.getAge() +
                ", teacherID=" + teacherID +
                ", subject=" + subject +
                ", classroom=" + classroom +
                '}';

    }

}

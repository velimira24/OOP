package StudentDomen;

public class User {
    /* задаем в классе информацию об имене */
    private String firstName;
    /* фамилии */
    private String secondName;
    /* возрасте */
    private int age;

    /* конструктор, где вызываются имя, фамилия и возраст */
    public User(String firstName, String secondName, int age) {
        /* это имя = имя* */
        this.firstName = firstName;
        /* эта фамилия = фамилия */
        this.secondName = secondName;
        /* этот возраст = возраст */
        this.age = age;
    }

    /* извлекаем имя */
    public String getFirstName() {
        return firstName;
    }

    /* задаем имя */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /* извлекаем фамилию */
    public String getSecondName() {
        return secondName;
    }

    /* задаем фамилию */
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    /* извлекаем возраст */
    public int getAge() {
        return age;
    }

    /* задаем возраст */
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    /* вывод на экран */
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }
}
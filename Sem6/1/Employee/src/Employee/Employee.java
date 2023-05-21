import java.util.Date;
import Employee.*;

public class Employee {
    private String name;
    private Date dob;

    public Employee(String name, Date dob) {
        this.name = name;
        this.dob = dob;

    }

    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }

}
package Employee;

public class calculateNetSalaty {
    private int baseSalary;

    public int calculateNetSalary() {
        this.baseSalary = baseSalary;
        int tax = (int) (baseSalary * 0.25);// calculate in otherway
        return baseSalary - tax;
    }
}

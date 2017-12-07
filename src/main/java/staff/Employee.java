package staff;

public class Employee {
    protected String name;
    protected String niNumber;
    protected Double salary;

    public Employee(String name, String niNumber, Double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getNINumber() {
        return niNumber;
    }

    public void increaseSalary(double salaryIncrease) {
        if (salaryIncrease > 0.0) {
            this.salary += salaryIncrease;
        }
    }

    public Double payBonus() {
        return this.salary * 0.01;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }
}

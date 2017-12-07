package staff.management;

import staff.Employee;

public class Manager extends Employee {
    String deptName;

    public Manager(String name, String niNumber, Double salary, String deptName) {
        super(name, niNumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}

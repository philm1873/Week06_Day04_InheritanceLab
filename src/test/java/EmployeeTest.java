import staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class EmployeeTest {

    Employee testEmployee;

    @Before
    public void before() {
        testEmployee = new Employee("Jimmy", "AA 12 23 47 B", 26000.0);
    }

    @Test
    public void getEmployeeSalary() {
        Double salary = 26000.0;
        assertEquals(salary, testEmployee.getSalary());
    }

    @Test
    public void getEmployeeName(){
        assertEquals("Jimmy", testEmployee.getName());
    }

    @Test
    public void canIncreaseSalary() {
        testEmployee.increaseSalary(10000.0);
        Double salary = 36000.0;
        assertEquals(salary, testEmployee.getSalary());
    }

    @Test
    public void getEmployeeNINumber(){
        assertEquals("AA 12 23 47 B", testEmployee.getNINumber());
    }

    @Test
    public void canGetSalary() {
        Double bonus = 260.0;
        assertEquals(bonus, testEmployee.payBonus());
    }

    @Test
    public void noNegativeSalary() {
        testEmployee.increaseSalary(-10000.0);
        Double salary = 26000.0;
        assertEquals(salary, testEmployee.getSalary());
    }

    @Test
    public void canSetEmployeeName() {
        testEmployee.setName("Bill");
        assertEquals("Bill", testEmployee.getName());
    }

    @Test
    public void cantSetEmployeeName() {
        testEmployee.setName(null);
        assertEquals("Jimmy", testEmployee.getName());
    }

}

import staff.management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager testManager;

    @Before
    public void before() {
        testManager = new Manager("Johnny", "CD 12 34 56 A", 50000.0, "Engineering");
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Engineering", testManager.getDeptName());
    }
}

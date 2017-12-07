import staff.management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DirectorTest {

    Director testDirector;

    @Before
    public void before() {
        testDirector = new Director(
                "Simon",
                "12 56 74 12 B",
                100000.0,
                "The Board",
                1000000.0
        );
    }

    @Test
    public void canGetBudget(){
        Double budget = 1000000.0;
        assertEquals(budget, testDirector.getBudget());
    }

    @Test
    public void directorBonus(){
        Double bonus = 2000.0;
        assertEquals(bonus, testDirector.payBonus());
    }
}

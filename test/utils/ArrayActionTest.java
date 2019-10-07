package utils;

import by.epam.arrays.firsttask.utils.ArrayAction;
import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;


public class ArrayActionTest {

    @Test
    public void shouldFindMin() throws Exception {
        double[] testArray = {10.0, 5.0, -2.0, 4.0, 67.89};
        double actual = ArrayAction.findMin(testArray);
        assertEquals(-2.0, actual);
    }

    @Test
    public void shouldFindMax() throws Exception {
        double[] testArray = {1.987, -2.4, 9.2, 7.0, 0.6};
        double actual = ArrayAction.findMax(testArray);
        assertEquals(9.2, actual);
    }

    @Test
    public void shouldFindAverage() throws Exception {
        double[] testArray = {2.0, -3.4, 4.6, 7.8, 9};
        double actual = ArrayAction.findAverage(testArray);
        assertEquals(4.0, actual);
    }

}

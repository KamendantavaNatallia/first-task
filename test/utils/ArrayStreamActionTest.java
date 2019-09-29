package utils;

import by.epam.arrays.firsttask.utils.ArrayStreamAction;
import by.epam.arrays.firsttask.exception.NullArrayException;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArrayStreamActionTest {
    private ArrayStreamAction arrayStreamAction;
    private double[] array = {2.0, 4.0, 6.0, 8.0, 10.0};

    @Test
    public void testFindMin() throws NullArrayException {
            double actual = ArrayStreamAction.findMin(array);
            assertEquals(2.0, actual);
        }

    @Test
    public void testFindMax() throws NullArrayException {
        double actual = ArrayStreamAction.findMax(array);
        assertEquals(10.0, actual);
    }

    @Test
    public void testFindAverage() throws NullArrayException{
        double actual = ArrayStreamAction.findAverage(array);
        assertEquals(6.0, actual);
    }
}
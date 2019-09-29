package sorter;

import by.epam.arrays.firsttask.sorter.ArraySorter;
import org.junit.Test;

public class ArraySorterTest {
    private void assertEquals(double[] testedArray, double[] actual) {
    }

    @Test
    public void testInsertionSort() {
        double [] testedArray = {-6.0, 2.0, 4.0, 10.0};
        double[] testArray = {2.0, -6.0, 10.0, 4.0};
        double [] actual = ArraySorter.insertionSort(testArray);
        assertEquals(testedArray, actual);
    }

    @Test
    public void testSelectionSort() {
        double [] testedArray = {-6.0, 2.0, 4.0, 10.0};
        double[] testArray = {2.0, -6.0, 10.0, 4.0};
        double [] actual = ArraySorter.insertionSort(testArray);
        assertEquals(testedArray, actual);
    }

    @Test
    public void testBubbleSort() {
        double [] testedArray = {-6.0, 2.0, 4.0, 10.0};
        double[] testArray = {2.0, -6.0, 10.0, 4.0};
        double [] actual = ArraySorter.insertionSort(testArray);
        assertEquals(testedArray, actual);
    }
}
package by.epam.arrays.firsttask.utils;

import java.util.Arrays;

public class ArrayStreamAction {

    public static double findMin(double... array) throws NullArrayException {
        if (array == null) {
            throw new NullArrayException("Array is NULL");
        }
        else
        {
            return Arrays.stream(array).min().getAsDouble();
        }
    }

    public static double findMax(double... array) throws NullArrayException {
        if (array == null) {
            throw new NullArrayException("Array is NULL");
        }
        else
        {
            return Arrays.stream(array).max().getAsDouble();
        }
    }

    public static double findAverage(double... array) throws NullArrayException {
        if (array == null) {
            throw new NullArrayException("Array is NULL");
        }
        else
        {
            return Arrays.stream(array).average().getAsDouble();
        }
    }
}
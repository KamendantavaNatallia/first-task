package by.epam.arrays.firsttask.utils;

import by.epam.arrays.firsttask.exception.NullArrayException;

public class ArrayAction {

    public static double findMin(double[] array) throws Exception{

        if (array == null){
            throw new NullArrayException("Array is NULL");
        }
        if (array.length < 2) {
            return array[0];
        }

        double min = array[0];

        for (int i = 0; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public static double findMax(double... array) throws Exception{

        if (array == null){
            throw new NullArrayException("Array is NULL");
        }
        if (array.length < 2) {
            return array[0];
        }

        double max = array[0];

        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static double findAverage(double ... array) throws Exception{

        if (array == null){
            throw new NullArrayException("Array is NULL");
        }
        if (array.length < 2) {
            return array[0];
        }

        double average = 0.0;

        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        average = average/array.length;
        return average;
    }
}
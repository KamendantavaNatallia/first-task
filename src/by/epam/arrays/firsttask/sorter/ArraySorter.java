package by.epam.arrays.firsttask.sorter;

public class ArraySorter {

    public static double[] insertionSort(double[] array) {
        for (int i = 1; i < array.length; i++) {
            double current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
        return array;
    }

    public static double[] selectionSort(double[] array) {
        for (int i = 0; i < array.length; i++) {
            double min = array[i];
            int minId = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            double temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
        return array;
    }

    public static double[] bubbleSort(double[] array) {
        boolean sorted = false;
        double temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
        return array;
    }
}
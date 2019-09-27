package by.epam.arrays.firsttask.creator;

import java.util.Random;


public class ArrayCreator {
    public double[] array;

    public ArrayCreator(int length, int rageLimit) {
        array = new double[length];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rageLimit * random.nextDouble();
        }
    }
}

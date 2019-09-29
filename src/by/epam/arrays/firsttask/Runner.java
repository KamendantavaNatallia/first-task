package by.epam.arrays.firsttask;

import by.epam.arrays.firsttask.creator.ArrayCreator;
import by.epam.arrays.firsttask.parser.LineParser;
import by.epam.arrays.firsttask.sorter.ArraySorter;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Runner {

    public static void main(String[] args) throws IOException {
        ArrayCreator arr = new ArrayCreator(10, 100);
        System.out.println(Arrays.toString(arr.array));
        System.out.println(Arrays.toString(ArraySorter.insertionSort(arr.array)));

        String fileName = "/Users/nkamendantava/IdeaProjects/first/resources/numbers.txt";

        List<Double> doubles = LineParser.getLineParse(fileName);

        System.out.println("The resulted massive: " + doubles);
    }
}
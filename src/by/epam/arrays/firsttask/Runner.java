package by.epam.arrays.firsttask;

import by.epam.arrays.firsttask.creator.ArrayCreator;
import by.epam.arrays.firsttask.parser.LineParser;
import by.epam.arrays.firsttask.reader.FileReader;
import by.epam.arrays.firsttask.sorter.ArraySorter;
import by.epam.arrays.firsttask.utils.ArrayAction;

import java.util.Arrays;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        ArrayCreator arr = new ArrayCreator(10, 100);
        System.out.println(Arrays.toString(arr.array));
        System.out.println(Arrays.toString(ArraySorter.insertionSort(arr.array)));

        try {
            System.out.println("min = " + ArrayAction.findMin((arr.array)));
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println("max = " + ArrayAction.findMax((arr.array)));
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println("average = " +ArrayAction.findAverage((arr.array)));
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        FileReader filereader = new FileReader("/Users/nkamendantava/IdeaProjects/first/resources/numbers.txt");

        List<String> lines = FileReader.readLines();

        List<Double> doubles = LineParser.getLineParse(lines);

        System.out.println("The resulted massive: " + doubles);
    }
}
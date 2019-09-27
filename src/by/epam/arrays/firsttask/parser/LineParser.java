package by.epam.arrays.firsttask.parser;

import by.epam.arrays.firsttask.validator.ArrayValidator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static by.epam.arrays.firsttask.reader.FileReader.readLines;

public class LineParser {
    List<String> lines;
    List<Double> doubles;

    public static List<Double> getLineParse(List<String> lineS) {
        List<String> lines = readLines();
        List<Double> doubles = new ArrayList<Double>();
        String currentLine;

        Iterator iterator = lines.iterator();
        while(iterator.hasNext()) {

            currentLine = iterator.next().toString().trim();

            for (String number : currentLine.split("\\s")) {

                if(ArrayValidator.isNumeric(number)) {
                    doubles.add(Double.parseDouble(number));
                }
            }
        }
        return doubles;
    }

    }


    /*public static List<List<Double>> parse(List<String> lines) {
        List<List<Double>> doubles = new ArrayList<>();

        for (String line : lines) {
            String[] str = line.split("\\s");
            double[] array = new double[str.length];
            for (int i = 0; i < array.length; i++) {
                array[i] = Double.parseDouble(str[i].trim());
            }

            List<Double> doubleArray = Arrays.stream(array).boxed().collect(Collectors.toList());
            doubles.add(doubleArray);
        }
        return doubles;
    }*/

package by.epam.arrays.firsttask.parser;

import by.epam.arrays.firsttask.reader.TxtReader;
import by.epam.arrays.firsttask.validator.ArrayValidator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LineParser {
    List<String> lines;
    List<Double> doubles;

    public static List<Double> getLineParse(String fileName) throws IOException {

        TxtReader txtReader = new TxtReader(fileName);
        List<String> lines = txtReader.readLines();

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
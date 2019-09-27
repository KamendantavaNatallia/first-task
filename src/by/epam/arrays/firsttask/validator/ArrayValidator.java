package by.epam.arrays.firsttask.validator;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrayValidator {
    private static final String DOUBLE_REG = ("-?\\d+(\\.\\d+)?");

    public static boolean isNumeric(String line) {

        if(line == null) {
            return false;
        }

        Pattern pattern = Pattern.compile(DOUBLE_REG);
        Matcher matcher = pattern.matcher(line);
        return matcher.matches();
    }
}
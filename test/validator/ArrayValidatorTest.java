package validator;

import by.epam.arrays.firsttask.validator.ArrayValidator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ArrayValidatorTest {

    @DataProvider(name = "strings")
    public static Object[][] stringNumbers() {
        return new Object[][]{{"1.00", true}, {"15.00", true}, {"7.00z", false}, {null, false}, {"234.00gf", false}, {"12 32", false}};
    }

    @Test(dataProvider = "strings")
    public void testIsNumeric(String line, boolean expectedResult) {
       boolean actualResult = ArrayValidator.isNumeric(line);
       assertEquals(expectedResult, actualResult);
    }
}
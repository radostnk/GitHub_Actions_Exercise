import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class TestCalculator {

    @ParameterizedTest
    @CsvSource(value = {"9, 3"})
    void testSum(int a, int b) {
        int expectedResult = 12;
        int actualResult = Calculator.sum(a, b);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource(value = {"10, 2"})
    void testMultiply(int a, int b) {
        int expectedResult = 20;
        int actualResult = Calculator.multiply(a, b);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource(value = {"10, 2"})
    void testDivide(int a, int b) {
        int expectedResult = 5;
        int actualResult = Calculator.divide(a, b);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource(value = {"10, 2"})
    void testSubtract(int a, int b) {
        int expectedResult = 8;
        int actualResult = Calculator.subtract(a, b);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}

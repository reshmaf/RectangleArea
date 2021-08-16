import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import exceptions.NegativeDimensionException;
import exceptions.zeroDimensionException;

public class RectangleTest {

    @Test
    void shouldReturnZeroIfTheDimensionsAreNegative() {
        float length = -2, breadth = -7;
        String expectedMessage = "Enter positive dimensions.";
        Rectangle rectangle = new Rectangle(length, breadth);

        Throwable exception = assertThrows(NegativeDimensionException.class, rectangle::area);
        String actualMessage = exception.getMessage();

        assertEquals(actualMessage, expectedMessage);
    }

    @Test
    void shouldReturnZeroIfTheDimensionsAreZero() {
        float length = 0, breadth = 0;
        String expectedMessage = "Enter positive dimensions.";
        Rectangle rectangle = new Rectangle(length, breadth);

        Throwable exception = assertThrows(ZeroDimensionException.class, rectangle::area);
        String actualMessage = exception.getMessage();

        assertEquals(actualMessage, expectedMessage);
    }

    @Test
    void shouldReturnValueIfTheDimensionsArePositive() {
        float length = 2.341f, breadth = 7.890f;
        float expectedArea = 18.47f;
        Rectangle rectangle = new Rectangle(length, breadth);
        float actualArea = 0;

        try {
            actualArea = rectangle.area();
        } catch (NegativeDimentionException | ZeroDimentionException e) {
            e.printStackTrace();
        }
        assertEquals(expectedArea, actualArea);
    }
}

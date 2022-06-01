import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareRootTest {
    SquareRoot sr = new SquareRoot();

    @Test
    void sqrtWithNullTest() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            sr.squareRoot(null);
        });
    }

    @Test
    void sqrtWithZeroTest() {
        Assertions.assertEquals(0.0, sr.squareRoot(0.0));
    }

    @Test
    void sqrtWithNegativeTest() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            sr.squareRoot(-1.0);
        });
    }

    @Test
    void sqrtWith100Test() {
        Double actual = sr.squareRoot(100.0);
        Assertions.assertEquals(10.0, actual);
    }

    @Test
    void sqrtWith400Test() {
        Double actual = sr.squareRoot(400.0);
        Assertions.assertEquals(20.0, actual);
    }
}
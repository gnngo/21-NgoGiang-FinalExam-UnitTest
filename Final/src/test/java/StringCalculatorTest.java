import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    @BeforeEach
    public void setUp() {

    }

    @AfterEach
    public void tearDown() {

    }

    //if it's negative
    @Test
    void test1() {
        Throwable exception = Assertions.assertThrows(Exception.class, () -> {
            StringCalculator.add("-5,5");
        });
    }

    //if it's greater than 1000
    @Test
    void test2() throws Exception {
        assertEquals(5, StringCalculator.add("2021,5"));
    }

}

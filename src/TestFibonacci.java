/**
 * Created by PierreM on 18/01/2015.
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestFibonacci {
    long startTime;
    long stopTime;
    long elapsedTime;

    long expected;
    int input;

    public TestFibonacci (int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {{40, 102334155}, {45, 1134903170}};
        return Arrays.asList(data);
    }

    @Test
    public void tests_fib() {
        startTime = System.currentTimeMillis();
        long output = Fibonacci.fib(input);
        assertEquals(expected, output);
        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;
        System.out.println(startTime+" "+stopTime+" "+elapsedTime);
    }

    @Test
    public void tests_fibImproved() {
        startTime = System.currentTimeMillis();
        long output = Fibonacci.fibImproved(input);
        assertEquals(expected, output);
        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;
        System.out.println(startTime+" "+stopTime+" "+elapsedTime);
    }

}

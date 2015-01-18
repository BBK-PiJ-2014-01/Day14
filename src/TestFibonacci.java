/**
 * Created by PierreM on 18/01/2015.
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestFibonacci {
    long startTime;
    long stopTime;
    long elapsedTime;

    @Test
    public void tests_fib() {
        startTime = System.currentTimeMillis();
        int output = Fibonacci.fib(40);
        int expected = 102334155;
        assertEquals("40th",expected, output);
        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime);
        // 1134903170
    }

    @Test
    public void tests_fibImproved() {
        startTime = System.currentTimeMillis();
        int output = Fibonacci.fibImproved(45);
        int expected = 1134903170;
        assertEquals(expected, output);
        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;
        System.out.println(startTime+" "+stopTime+" "+elapsedTime);
    }

}

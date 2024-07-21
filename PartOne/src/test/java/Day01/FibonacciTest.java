/**
 * @author Cindy
 */

package Day01;

import org.junit.Test;

import static com.cindy.Day01.Fibonacci.fibonacci;

public class FibonacciTest {
    @Test
    public void testFibonacci() {
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(4));
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(6));
        System.out.println(fibonacci(7));
    }
}

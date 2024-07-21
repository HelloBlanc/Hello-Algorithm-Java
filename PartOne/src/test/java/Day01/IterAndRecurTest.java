/**
 * @author Cindy
 */

package Day01;

import org.junit.Test;

import static com.cindy.Day01.IterAndRecur.*;

public class IterAndRecurTest {
    @Test
    public void Test() {
        long start1 = System.nanoTime();
        System.out.println(forLoop(10000));
        long end1 = System.nanoTime();
        System.out.println(end1 - start1);

        long start2 = System.nanoTime();
        System.out.println(whileLoop(10000));
        long end2 = System.nanoTime();
        System.out.println(end2 - start2);

        long start3 = System.nanoTime();
        System.out.println(recurCom(10000));
        long end3 = System.nanoTime();
        System.out.println(end3 - start3);

        long start4 = System.nanoTime();
        System.out.println(tailRecurCom(10000,0));
        long end4 = System.nanoTime();
        System.out.println(end4 - start4);
    }
}

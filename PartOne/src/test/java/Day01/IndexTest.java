/**
 * @author Cindy
 */

package Day01;

import org.junit.Test;

import java.util.Arrays;

public class IndexTest {
    @Test
    public void testBinarySearch() {
        int[] a = {2,5,8};
        int target = 4;
        int i = Arrays.binarySearch(a, target);
        System.out.println(i);

        /*i<0代表没有找到,则插入*/
        /**
         *   {2, 5, 8}  a
         *   {2, 0, 0, 0}  b
         *   {2, 4, 0, 0}  b
         *   {2, 4, 5, 8}  b
         *
         */
        if (i < 0){
            int index = Math.abs(i + 1);
            int[] b = new int[a.length + 1];
            System.arraycopy(a, 0, b, 0, index);
            b[index] = target;
            System.arraycopy(a, index, b, index + 1, a.length - index);
            System.out.println(Arrays.toString(b));
        }
    }
}

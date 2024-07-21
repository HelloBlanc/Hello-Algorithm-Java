/**
 * @author Cindy
 */

package Day01;

import org.junit.Test;
import static com.cindy.Day01.BinarySearch2.*;
public class BinarySearchTest2 {
    @Test
    public void testBinarySearch1() {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch1(arr,5));
    }
    @Test
    public void testBinarySearch2() {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch2(arr,5));
    }
    @Test
    public void testBinarySearch3() {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearchThe(arr,5));
    }
    @Test
    public void testBinarySearch4() {
        int[] arr = {1,2,4,4,4,6,7,8,9};
        System.out.println(binarySearch4(arr,4));
    }
    @Test
    public void testBinarySearch5() {
        int[] arr = {1,2,4,4,4,6,7,8,9};
        System.out.println(binarySearch5(arr,4));
    }
    @Test
    public void testBinarySearch6() {
        int[] arr = {1,2,4,4,4,6,7,8,9};
        System.out.println(binarySearch6(arr,5));
    }
    @Test
    public void testBinarySearch7() {
        int[] arr = {1,2,4,4,4,6,7,8,9};
        System.out.println(binarySearch7(arr,4));
    }
}

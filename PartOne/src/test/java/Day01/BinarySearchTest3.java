/**
 * @author Cindy
 */

package Day01;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static com.cindy.Day01.BinarySearch3.*;
public class BinarySearchTest3 {
    @Test
    @DisplayName("左边界测试")
    public void testLeftMost() {
        int[] arr = { 1, 2, 4, 4, 4, 7, 8, 9 };
        System.out.println("下标为:" + leftMost(arr,4));
    }
    @Test
    @DisplayName("右边界测试")
    public void testRightMost() {
        int[] arr = { 1, 2, 4, 4, 4, 7, 8, 9 };
        System.out.println("下标为:" + rightMost(arr,4));
    }
}

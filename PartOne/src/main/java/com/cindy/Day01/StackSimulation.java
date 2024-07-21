/**
 * @author Cindy
 */

package com.cindy.Day01;

import java.util.Stack;

public class StackSimulation {
    public static int stackMethod(int n) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        /*模拟进栈过程*/
        for (int i = n; i > 0 ; i--) {
            stack.add(i);
        }
        /*模拟出栈过程*/
        while (!stack.isEmpty()) {
           res += stack.pop();
        }
        return res;
    }

}

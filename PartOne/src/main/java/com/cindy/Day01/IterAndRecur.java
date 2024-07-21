/**
 * @author Cindy
 */

package com.cindy.Day01;

public class IterAndRecur {
    /*for-loop实现*/
    public static int forLoop(int n){
        int res = 0;
        for (int i = 0; i <= n; i++) {
            res += i;
        }
        return res;
    }

    /*while-loop实现*/
    public static int whileLoop(int n){
        int res = 0;
        int i = 0;
        while (i <= n) {
            res += i;
            ++i;
        }
        return res;
    }

    /*recursion实现*/
    public static int recurCom(int n){
        if (n == 1) {return 1;}
        return recurCom(n - 1) + n;
    }

    /*tail_recursion实现*/
    public static int tailRecurCom(int n,int res){
        if (n == 0) {return res;}
        return tailRecurCom(n - 1, res + n);
    }
}

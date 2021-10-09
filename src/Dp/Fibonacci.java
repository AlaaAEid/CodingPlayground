package Dp;

import java.util.HashMap;

public class Fibonacci {
    public static HashMap<Integer,Long> memo = new HashMap<>();

    public static long classicFib(int n) {
        if (memo.containsKey(n)) return memo.get(n);
        if (n <= 2 ) return 1;
        memo.put(n,classicFib(n-1) + classicFib(n-2));
        return memo.get(n);
    }

    public static void main (String [] args) {
        System.out.println(classicFib(50));

    }
}

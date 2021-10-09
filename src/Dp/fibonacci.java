package Dp;

public class fibonacci {
    public static long getFib(int n) {
        if (n <= 2) return  1;

        return getFib(n-1) + getFib( n - 2);
    }

    public static void main (String [] args) {
        System.out.println(getFib(6));
        System.out.println(getFib(7));
        System.out.println(getFib(50));
    }
}

package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class A337Puzzles {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), m = scan.nextInt();
        int[] a = new int[m];
        for (int i = 0 ; i < m ; i ++) {
            a[i] = scan.nextInt();
        }

        Arrays.sort(a);
        int min = 9999999;
        for (int i = 0 ; i <= m-n ; i ++) {
            min = Math.min(min, a[i+n-1] - a[i]);
        }

        System.out.println(min);
    }
}

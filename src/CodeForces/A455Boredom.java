package CodeForces;

import java.util.Scanner;

public class A455Boredom {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int n  = scan.nextInt(), tmp = 0;
        long [] a = new long[ 100001];
        for (int i = 0 ; i < n ; i ++ ) {
            tmp = scan.nextInt();
            a[tmp] += tmp;
        }

        for (int i = 2 ; i < 100001 ; i ++) {
            a[i] = Math.max(a[i]+a[i-2], a[i-1]);
        }

        System.out.println(a[100000]);
    }
}

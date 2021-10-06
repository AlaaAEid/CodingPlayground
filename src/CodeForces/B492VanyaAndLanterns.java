package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class B492VanyaAndLanterns {
    public static void main (String []args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), l = scan.nextInt(),  temp;
        double diff;
        int [] a = new int[n];
        for (int i = 0 ; i < n ; i ++) a[i] = scan.nextInt();
        Arrays.sort(a);
        diff = Math.max(a[0] , l - a[n-1]);
        System.out.println(diff);
        for (int i = 1 ; i < n ; i ++) {
            diff = Math.max((a[i] - a[i-1])/2.0 , diff);
        }

        System.out.println(diff);
        scan.close();
    }
}

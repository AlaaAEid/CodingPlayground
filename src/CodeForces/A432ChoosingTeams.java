package CodeForces;

import java.util.Scanner;

public class A432ChoosingTeams {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), k = scan.nextInt(), count = 0;
        int [] a = new int[n];
        for(int i = 0 ; i < n ; i ++) {
            a[i] = scan.nextInt() + k;
            if ( a[i] <= 5) count ++;
        }

        System.out.println(count/3);
    }
}

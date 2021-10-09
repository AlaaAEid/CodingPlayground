package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class A1154RestoringThreeNumbers {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int [] a = new int[4];
        for (int i = 0 ; i < 4 ; i ++) a[i] = scan.nextInt();
        Arrays.sort(a);
        System.out.print((a[3]-a[0]) + " " +( a[3] - a[1]) + " " + (a[3] - a[2]));
    }
}

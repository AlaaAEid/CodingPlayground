package CodeForces;

import java.util.Scanner;

public class A758HolidayOfEquality {
    public static void main (String [] args ) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(),tmp =0,sum = 0, max = -1;
        long ans = 0;
        for(int i = 0 ; i < n ; i ++) {
            tmp = scan.nextInt();
            max = Math.max(max, tmp);
            sum += tmp;
        }

        System.out.println((max*n) - sum);
    }
}

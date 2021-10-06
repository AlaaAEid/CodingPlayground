package CodeForces;

import java.util.Scanner;

public class A996HitTheLottery {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        long s = scan.nextLong();
        long bills = 0;
        if (s >= 100) {
            bills = s/100;
            s = s % 100;
        }
        if ( s >= 20) {
            bills += s/ 20;
            s = s% 20;
        }
        if ( s >= 10) {
            bills += s/ 10;
            s = s% 10;
        }
        if ( s >= 5) {
            bills += s/ 5;
            s = s% 5;
        }
        if ( s >= 1) {
            bills += s;
            s = 0;
        }

        System.out.println(bills);
    }
}

package CodeForces;

import java.util.Scanner;

public class A116Tram {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int max = 0;
        int cap = 0;
        int a_in, a_out;
        while ( n > 0 ) {
            cap -= scan.nextInt();
            cap += scan.nextInt();

            max = Math.max(max, cap);
            n --;
        }

        System.out.println(max);
    }
}

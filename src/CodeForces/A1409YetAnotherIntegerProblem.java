package CodeForces;

import java.util.Scanner;

public class A1409YetAnotherIntegerProblem {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(),a,b;

        while(n -- > 0 ) {
            a = scan.nextInt();
            b = scan.nextInt();

            long x=Math.abs(a-b);
            x=x+9;
            System.out.println(x/10);
        }
    }
}

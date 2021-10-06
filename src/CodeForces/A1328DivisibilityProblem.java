package CodeForces;

import java.util.Scanner;

public class A1328DivisibilityProblem {
    public static void main (String [] args) {
        Scanner scan = new Scanner( System.in);
        int n = scan.nextInt(), count = 0;
        Long a,b;
        while (n > 0) {
            a= scan.nextLong();
            b= scan.nextLong();

            System.out.println(a % b == 0 ? 0 : b - (a % b));
            n--;
        }
    }
}

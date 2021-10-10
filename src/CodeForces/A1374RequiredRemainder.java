package CodeForces;

import java.util.Scanner;

public class A1374RequiredRemainder {
    public static void main (String []args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0 ) {
            long x = scan.nextLong(), y = scan.nextLong(), n = scan.nextLong();
            long r=n-((n-y)%x);
            System.out.println(r);
        }
    }
}

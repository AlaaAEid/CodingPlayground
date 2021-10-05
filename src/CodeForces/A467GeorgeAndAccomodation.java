package CodeForces;

import java.util.Scanner;

public class A467GeorgeAndAccomodation {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), count = 0;

        while (n > 0) {
            count += scan.nextInt() < scan.nextInt()-1 ? 1 : 0;
            n--;
        }

        System.out.println(count);
    }
}

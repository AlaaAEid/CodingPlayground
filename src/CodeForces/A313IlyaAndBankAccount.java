package CodeForces;

import java.util.Scanner;

public class A313IlyaAndBankAccount {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), tmp = n;
        if (n >= 0 ) System.out.println(n);
        else {
            System.out.println(Math.max(n/10, n % 10 + n/100 * 10));
        }
    }
}

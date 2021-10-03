package CodeForces;

import java.util.Scanner;

public class A4Watermelon {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println( n%2==0&&n!=2?"YES":"NO" );
    }
}

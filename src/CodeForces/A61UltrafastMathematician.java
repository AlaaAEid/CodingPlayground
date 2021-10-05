package CodeForces;

import java.util.Scanner;

public class A61UltrafastMathematician {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next(), b = scan.next();

        for (int i = 0 ; i < a.length(); i++) {
            System.out.print(a.charAt(i) ^ b.charAt(i));
        }
    }
}

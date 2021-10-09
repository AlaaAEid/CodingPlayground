package CodeForces;

import java.util.Scanner;

public class A472DesignTutorialLearnFromMath {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = a / 2;
        int c = a - b;

        while( !( ( (b % 2) == 0 || (b % 3) == 0 ) && ( (c % 2) == 0 || (c % 3) == 0 ) ) ) {
            b++;
            c--;
        }

        System.out.println(b + " " + c);

    }
}

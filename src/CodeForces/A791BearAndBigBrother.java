package CodeForces;

import java.util.Scanner;

public class A791BearAndBigBrother {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt(), b = scan.nextInt(), count = 0;
        while (a <= b) {
            a *= 3;
            b *= 2;
            count ++;
        }
        System.out.println(count);
    }
}

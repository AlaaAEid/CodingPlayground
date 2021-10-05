package CodeForces;

import java.util.Scanner;

public class A677VanyaAndFence {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), h = scan.nextInt(),count = 0;

        while (n > 0) {
            count += scan.nextInt() <= h ? 1 : 2;
            n--;
        }

        System.out.println(count);
    }
}

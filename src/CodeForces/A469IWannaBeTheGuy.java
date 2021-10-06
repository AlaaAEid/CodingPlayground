package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class A469IWannaBeTheGuy {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean [] a = new boolean[n];

        int x = scan.nextInt();
        while(x > 0) {
            a[scan.nextInt()-1] = true;
            x--;
        }
        x = scan.nextInt();
        while(x > 0) {
            a[scan.nextInt()-1] = true;
            x--;
        }

        System.out.println(areAllTrue(a) ? "I become the guy." : "Oh, my keyboard!");
    }

    public static boolean areAllTrue(boolean[] array)
    {
        for(boolean b : array) if(!b) return false;
        return true;
    }
}

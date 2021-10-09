package CodeForces;

import java.util.Scanner;

public class A750NewYearAndHurry {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), k = scan.nextInt(), count;
        for (count = 1 ; (k + count * 5) <= 240 && count <= n; count ++) {
            k += count * 5;
        }

        System.out.println(count-1);

    }
}

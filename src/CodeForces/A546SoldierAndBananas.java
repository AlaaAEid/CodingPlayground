package CodeForces;

import java.util.Scanner;

public class A546SoldierAndBananas {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt(),n = scan.nextInt(), w = scan.nextInt();
        int sum = 0;
        for(int i = 1 ; i <= w ; i ++) {
            sum += i*k;
        }

        System.out.println(sum > n ? Math.abs(sum - n) : 0);
    }
}

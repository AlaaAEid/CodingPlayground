package CodeForces;

import java.util.Scanner;

public class A732BuyAShovel {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), r = scan.nextInt(),i;
        boolean flg = true;
        for ( i = 1; flg ; ) {
            System.out.println(n*i);
            if ((n*i) % 10 == 0 || ((n*i) - r) % 10 ==0 ) {
                flg = false;
            }
            i ++;
        }

        System.out.println(i-1);
    }
}

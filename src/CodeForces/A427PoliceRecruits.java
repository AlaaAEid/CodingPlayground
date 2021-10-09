package CodeForces;

import java.util.Scanner;

public class A427PoliceRecruits {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), current = 0, count = 0, tmp ;
        while(n -- > 0) {
            tmp = scan.nextInt();
            if ( tmp <= 0 && current == 0) count++;
            else current += tmp;
        }

        System.out.println(count);
    }
}

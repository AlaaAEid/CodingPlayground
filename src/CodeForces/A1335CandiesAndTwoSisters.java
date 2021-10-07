package CodeForces;

import java.util.Scanner;

public class A1335CandiesAndTwoSisters {
    public static void main (String [] args) {
        Scanner scan = new Scanner( System.in) ;
        int n = scan.nextInt(), x;

        while ( n --  > 0 ){
            x=scan.nextInt();
            System.out.println(x - ((x/2) + 1));
        }
    }
}

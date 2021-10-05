package CodeForces;

import java.util.Scanner;

public class A318EvenOdds {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong(), index =scan.nextLong();

        System.out.println( (n+1) / 2 >= index ? index * 2 - 1 : 2*(index-(n+1)/2) );

    }


}

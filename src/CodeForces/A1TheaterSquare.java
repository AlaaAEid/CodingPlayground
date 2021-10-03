package CodeForces;

import java.util.Scanner;

public class A1TheaterSquare {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int n,m,a ;
        n = scan.nextInt();
        m = scan.nextInt();
        a = scan.nextInt();
        long res = (long)(Math.ceil(n / (double)a) *
                Math.ceil(m / (double)a));
        System.out.println(res);
    }
}

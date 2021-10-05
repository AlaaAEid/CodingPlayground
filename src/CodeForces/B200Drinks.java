package CodeForces;

import java.util.Scanner;

public class B200Drinks {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;

        for(int i = 0 ; i < n ; i ++ , sum += scan.nextInt()) {}

        System.out.println((double)sum/n);
    }
}

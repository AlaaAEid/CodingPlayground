package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class A160Twins {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] coins = new int [n];
        int total = 0;
        for(int i = 0 ; i < n ; i ++ ){
            coins [i] = scan.nextInt();
            total += coins[i];
        }
        Arrays.sort(coins);
        int sum = 0;
        int count = 0;
        for(int i = n-1 ; i >= 0 && sum <= total ; i --, count ++) {
            sum += coins[i];
            total -= coins[i];
        }

        System.out.println(count);
    }
}

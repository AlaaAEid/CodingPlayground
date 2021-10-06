package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class A405GravityFlip {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] a = new int[n];
        for(int i = 0 ; i < a.length ; i ++ ) {a[i]= scan.nextInt();}

        int diff ;
        for(int i = 0 ; i < n ; i ++) {
            for(int j = i ; j < n ; j ++) {
                if(a[i] > a[j]){
                    diff = a[i] - a[j];
                    a[i] -= diff;
                    a[j] += diff;
                }
            }
        }

        StringBuilder str = new StringBuilder();
        for (int col:
             a) {
            str.append(" ").append(col);
        }

        System.out.println(str.toString().substring(1));
    }
}

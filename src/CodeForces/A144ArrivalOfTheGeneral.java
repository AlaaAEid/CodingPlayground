package CodeForces;

import java.util.Scanner;

public class A144ArrivalOfTheGeneral {
    public static void main (String [] args) {
        Scanner scan  = new Scanner(System.in);
        int n = scan.nextInt(), max = 0,maxInd = 0, min = 101, minInd=0;
        int [] soldiers = new int[n];


        for (int i = 0 ; i < n ; i ++) {
            soldiers[i] = scan.nextInt();
            if (max < soldiers[i]) {
                maxInd = i;
                max = soldiers[i];
            }

            if (min >= soldiers[i]) {
                minInd = i;
                min = soldiers[i];
            }
        }

        System.out.println((minInd>maxInd)?(maxInd+n-1-minInd):(maxInd+n-1-minInd-1));
    }
}

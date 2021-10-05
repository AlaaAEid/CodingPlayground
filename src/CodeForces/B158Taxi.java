package CodeForces;

import java.util.Scanner;

public class B158Taxi {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in) ;
        int n = scan.nextInt();
        int [] groups = new int[5];
        int temp = 0 , taxiCount = 0;

        for (int i = 0 ; i < n ; i ++) {
            temp= scan.nextInt();
            groups[temp] ++;
        }

        taxiCount = groups[4];
        taxiCount += groups[3];
        taxiCount += (Math.abs(Math.max(0, groups[1] - groups[3])) + groups[2]*2 + 3)/4;

        System.out.println(taxiCount);
    }
}

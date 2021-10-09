package CodeForces;

import java.util.Scanner;

public class A490TeamOlympiad {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), tmp;
        int [] team = new int [4];
        int ind[][] = new int[4][n];
        for (int i = 1 ; i <= n ; i ++) {
            tmp = scan.nextInt();
            ind[tmp][team[tmp]]+= i;
            team[tmp] += 1;
        }
        int min = Math.min(team[1], Math.min(team[2], team[3]));
        System.out.println(min);
        for (int i = 0;i < min;i++)
            System.out.println(ind[1][i] + " " + ind[2][i] + " " + ind[3][i]);
    }
}

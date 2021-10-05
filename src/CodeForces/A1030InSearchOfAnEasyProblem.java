package CodeForces;

import java.util.Scanner;

public class A1030InSearchOfAnEasyProblem {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int resp = 0;
        while(n > 0 && resp == 0 ) {
            resp = resp | scan.nextInt();
            n --;
        }

        System.out.println(resp != 0 ? "HARD" : "EASY");
    }
}

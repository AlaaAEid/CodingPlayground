package CodeForces;

import java.util.Scanner;

public class A510FoxAndSnake {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), m = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print( (i%2 != 0) || (i%4==2 && j==m) || (i%4==0 && j==1)? "#" : "." );
            }
            System.out.println();
        }
    }
}

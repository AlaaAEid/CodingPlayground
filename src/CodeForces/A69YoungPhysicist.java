package CodeForces;

import java.util.Scanner;

public class A69YoungPhysicist {
    public static void main (String [] args ) {
       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt(),x=0,y=0,z=0;
       while (n > 0 ) {
           x += scanner.nextInt();
           y += scanner.nextInt();
           z += scanner.nextInt();
           n --;
       }

       System.out.println( (x == 0 && y == 0 && z == 0) ? "YES" : "NO");

    }
}

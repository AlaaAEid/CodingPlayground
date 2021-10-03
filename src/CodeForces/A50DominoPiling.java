package CodeForces;

import java.util.Scanner;

public class A50DominoPiling {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt(), n = scan.nextInt();
        int area = m*n;
        System.out.println(area/2);
    }
}

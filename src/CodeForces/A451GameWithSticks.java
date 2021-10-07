package CodeForces;

import java.util.Scanner;

public class A451GameWithSticks {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), m = scan.nextInt(), x = n * m;
        System.out.println(Math.min(n,m) % 2 != 0 ? "Akshat" : "Malvika");
    }
}

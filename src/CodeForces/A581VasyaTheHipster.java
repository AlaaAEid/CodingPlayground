package CodeForces;

import java.util.Scanner;

public class A581VasyaTheHipster {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt(),total = a + b;
        System.out.println(Math.min(a , b) + " " + (total - Math.min(a,b) * 2)/2);
    }
}

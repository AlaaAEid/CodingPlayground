package CodeForces;

import java.util.Scanner;

public class A96Football {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println(s.contains("0000000") || s.contains("1111111") ? "YES" : "NO");
    }
}

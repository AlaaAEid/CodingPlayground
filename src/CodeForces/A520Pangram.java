package CodeForces;

import java.util.Locale;
import java.util.Scanner;

public class A520Pangram {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(scan.next().toLowerCase().chars().distinct().count() == 26 ? "YES" : "NO");
    }
}

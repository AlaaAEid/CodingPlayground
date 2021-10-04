package CodeForces;

import java.io.StringReader;
import java.util.Scanner;

public class A41Translation {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        String orig = scan.next(), translated = scan.next();

        StringBuilder str = new StringBuilder(translated);
        str.reverse();

        System.out.println(orig.equals(str.toString()) ? "YES": "NO");

    }
}

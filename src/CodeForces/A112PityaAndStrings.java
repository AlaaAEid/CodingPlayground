package CodeForces;

import java.util.Locale;
import java.util.Scanner;

public class A112PityaAndStrings {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        String first = scan.next().toLowerCase();
        String second = scan.next().toLowerCase();

        if (first.equals(second)) System.out.println(0);
        else {
            for (int i = 0 ; i < first.length(); i ++) {
                if (first.charAt(i) == second.charAt(i)) continue;
                else if (first.charAt(i) > second.charAt(i)) {System.out.println(1);break;}
                else if (first.charAt(i) < second.charAt(i)) {System.out.println(-1); break;}
            }
        }
    }
}

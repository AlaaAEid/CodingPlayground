package CodeForces;

import java.util.Scanner;

public class A1367ShortSubstrings {
    public static void main (String []args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n -- > 0) {
            String a = scan.next();

            System.out.print(a.charAt(0));
            for(int i = 1 ; i < a.length()-1 ; i += 2) {
                System.out.print(a.charAt(i));
            }
            System.out.print(a.charAt(a.length()-1));
            System.out.println();
        }
    }
}

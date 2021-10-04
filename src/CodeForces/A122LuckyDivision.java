package CodeForces;

import java.util.Scanner;

public class A122LuckyDivision {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        if (checkDivisible(s)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean checkDivisible(String a) {
        int num = Integer.parseInt(a);
        if (num % 4 == 0 || num % 7 == 0 || num % 47 == 0) {
            return true;
        }
        a = a.replace("4", "");
        a = a.replace("7", "");
        if (a.length() == 0) {
            return true;
        }
        return false;
    }
}

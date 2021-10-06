package CodeForces;

import java.util.*;
import java.util.stream.Collectors;

public class A141AmusingJoke {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        String host = scan.next().toUpperCase(), guest = scan.next().toUpperCase(), jumble = scan.next().toUpperCase();
        int [] a = new int [26];

        for (int c:
             host.toCharArray()) {
            a[c-65] += 1;
        }

        for (int c:
                guest.toCharArray()) {
            a[c-65] += 1;
        }

        for (int c:
                jumble.toCharArray()) {
            a[c-65] -= 1;
        }

        boolean flg = true;
        for (int j : a) {
            if (j != 0) {
                flg = false;
                break;
            }
        }

        System.out.println(flg ? "YES" : "NO");
    }
}

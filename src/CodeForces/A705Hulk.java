package CodeForces;

import java.util.Scanner;

public class A705Hulk {
    public static void main (String [ ]args) {
        Scanner scan = new Scanner(System.in);
        String [] a = {"I ", "hate that " , "love that ","hate it", "love it"};
        StringBuilder str = new StringBuilder();
        int n = scan.nextInt();
        boolean flg = false;
        while (n > 1) {
            str.append(a[0]);

            if (!flg) str.append(a[1]);
            else str.append(a[2]);

            flg = !flg;
            n --;
        }
        str.append(a[0]);
        if (flg) str.append(a[4]);
        else str.append(a[3]);
        System.out.println(str.toString());
    }
}

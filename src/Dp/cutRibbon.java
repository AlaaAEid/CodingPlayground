package Dp;

import java.util.Scanner;

public class cutRibbon {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int n  = scan.nextInt(), a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();
        int p=0;
        for (int i = 0; i*a <= n; ++i)
        {
            for (int j = 0; i*a + j*b <= n; ++j)
            {
                int k = (n - i*a - j*b)/c;
                if (i*a + j*b + k*c == n)
                    p= Math.max(i + j + k, p);
            }
        }
        System.out.println(p);
    }
}

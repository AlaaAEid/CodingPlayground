package CodeForces;

import java.util.Scanner;

public class A25IQTest {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(),even=0,odd=0;

        for(int i = 1 ; i <= n ; i ++) {
            if (scan.nextInt() % 2 == 0) even += i;
            else odd += i;
        }

        System.out.println(Math.min(even,odd));
    }
}

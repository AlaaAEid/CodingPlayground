package CodeForces;

import java.util.Scanner;

public class B1343BalancedArray {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while ( t -- > 0) {
            int n = scan.nextInt();
            System.out.println(n%4==0?"YES":"NO");
            if(n%4==0)
            {
                int i = 2;
                while(i<=n)
                {
                    System.out.print(i+" ");
                    i+=2;
                }
                i = 1;
                while(i!=n-1)
                {
                    System.out.print(i+" ");;
                    i+=2;
                }
                System.out.println(i+(n/2));
            }
        }
    }
}

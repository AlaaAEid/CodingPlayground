package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class B230TPrimes {
    public static void main (String []args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long b;
        double x;
        int [] sieve = new int [10000001];
        for(int i=2;i<=1000000;i++)
        {
            sieve[i]=1;
        }

        for(int i=2;i<=1000;i++)
        {
            if(sieve[i] != 0)
                for(int j=2*i;j<=1000000;j+=i)
                {
                    sieve[j]=0;
                }
        }
        for(int i=0;i<n;i++)
        {
            b=scan.nextLong();
            x=Math.sqrt(b);
            if(x==(int)x && sieve[(int)x]==1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

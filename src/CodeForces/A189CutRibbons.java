package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class A189CutRibbons {
    public static void main (String []args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int dp[]=new int[n+1];
        Arrays.fill(dp,-5000);dp[0]=0;
        for(int i=0;i<3;i++)
        {
            int no=in.nextInt();
            for(int j=no;j<=n;j++)
                dp[j]=Math.max(dp[j-no]+1,dp[j]);
        }
        System.out.println(dp[n]);
    }
}

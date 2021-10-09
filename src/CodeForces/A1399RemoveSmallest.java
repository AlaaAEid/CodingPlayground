package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class A1399RemoveSmallest {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while ( n -- > 0) {
            int k = scan.nextInt();
            int [] a = new int[k];
            for (int i = 0 ; i < k ; i ++) a[i] = scan.nextInt();
            Arrays.sort(a);
            String ans = "YES";
            for(int i=1; i<k; i++)
            {
                if(a[i]-a[i-1]>1)
                {
                    ans = "NO";
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}

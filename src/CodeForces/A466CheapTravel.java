package CodeForces;

import java.util.Scanner;

public class A466CheapTravel {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();

        int ans = Math.min(n*a, n/m*b) +Math.min(n%m*a,b);
        System.out.println(ans);
    }
}

package CodeForces;

import java.util.Scanner;

public class A580KefaAndFirstSteps {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), longestSub = 0,step = 0, current= 0, prev = 0;
        while(n > 0) {

            prev = current;
            current = scan.nextInt();
            if( current < prev){
                step = 0;
            }

            step ++;
            longestSub = Math.max(longestSub,step);
            n--;
        }

        System.out.println(longestSub);
    }
}

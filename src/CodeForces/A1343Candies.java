package CodeForces;

import java.util.Scanner;

public class A1343Candies {
    public static void main (String []args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t -- > 0 ) {
            int n = scan.nextInt(), sum = 1;

            for (int k = 1 ; k < n ; k ++) {
                sum += Math.pow(2,k);
                if(n%sum==0){
                    System.out.println(n/sum);
                    break;
                }
            }
        }
    }
}

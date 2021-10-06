package CodeForces;

import java.util.Scanner;


public class A785AntonAndPolyhedrons {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), sum = 0;
        int [] sides = {4,6,8,12,20};
        while(n -- > 0) {
            sum += sides["TCODI".indexOf(scan.next().charAt(0))];
        }

        System.out.println(sum);
    }
}

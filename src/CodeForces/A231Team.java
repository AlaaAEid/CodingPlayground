package CodeForces;

import java.util.Scanner;

public class A231Team {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        int curr;
        while(n > 0) {
            curr = 0;
            for(int i = 0 ; i < 3; i ++) curr+=scan.nextInt();
            if (curr >= 2 ) count ++;
            n --;
        }
        System.out.println(count);
    }
}

package CodeForces;

import java.util.Scanner;

public class A155ILoveUsername {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in) ;
        int n = scan.nextInt(), count= 0 , max, min, tmp;
        max = scan.nextInt();
        min = max;

        while(n-- > 1) {
            tmp = scan.nextInt();
            if( Math.min(min, tmp) != min) {
                min = tmp ;
                count ++;
            }
            if( Math.max(max, tmp) != max) {
                max = tmp ;
                count ++;
            }

        }

        System.out.println( count  );
    }
}

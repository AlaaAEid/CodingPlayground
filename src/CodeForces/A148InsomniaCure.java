package CodeForces;

import java.util.Scanner;

public class A148InsomniaCure {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt(),
                l = scan.nextInt(),
                m = scan.nextInt(),
                n = scan.nextInt(),
                d = scan.nextInt(),
                count = 0;
        ;

        for (int i = 1 ; i <= d ; i ++) {
            if (i % k == 0) count ++;
            else if (i % l == 0) count ++;
            else if (i % m == 0) count ++;
            else if (i % n == 0) count ++;
        }

        System.out.println(count);

    }
}

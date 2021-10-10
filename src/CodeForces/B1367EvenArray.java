package CodeForces;

import java.util.Scanner;

public class B1367EvenArray {
    public static void main (String []args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t -->0) {
            int n = scan.nextInt(), tmp, x = 0,y = 0;
            for(int i = 0 ; i < n ; i ++) {
                tmp = scan.nextInt();
                if (i % 2 == 0 && tmp % 2 != 0) x++;
                if (i % 2 != 0 && tmp % 2 == 0) y++;
            }

            System.out.println(x==y?x:-1);
        }
    }
}

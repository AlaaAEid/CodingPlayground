package CodeForces;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class A282Bitpp {
    public static void main (String [] args) throws UnsupportedEncodingException {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        while(n > 0) {
            if((int)scan.next().charAt(1) == 43) count ++;
            else count --;
            n --;
        }
        System.out.println(count);
    }
}

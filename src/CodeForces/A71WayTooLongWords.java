package CodeForces;

import java.util.Scanner;

public class A71WayTooLongWords {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String tmp ;
        int length;
        while(n > 0) {
            tmp = scan.next();
            length = tmp.length();
            if (length > 10) System.out.println(tmp.charAt(0)+""+(length-2)+""+tmp.charAt(length-1));
            else System.out.println(tmp);
            n --;
        }
    }
}

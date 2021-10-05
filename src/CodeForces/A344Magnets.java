package CodeForces;

import java.util.Scanner;

public class A344Magnets {
    public static void main (String []args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt()-1, count = 1;
        String current = scan.next();
        String prev = "";
        while(n > 0 ) {
            prev = current;
            current = scan.next();

            if (!current.equals(prev)) count++;
            n --;
        }
        System.out.println(count);
    }
}

package CodeForces;

import java.util.Scanner;

public class A131CapsLock {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        if(s.matches("[A-Z]*"))
            System.out.println(s.toLowerCase());
        else if(s.matches("[a-z][A-Z]*"))
            System.out.println(s.substring(0,1).toUpperCase()+s.substring(1,s.length()).toLowerCase());
        else
            System.out.println(s);
    }
}

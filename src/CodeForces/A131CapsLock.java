package CodeForces;

import java.util.Scanner;

public class A131CapsLock {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        if (input.matches("^[A-Z]$") || input.matches("^[a-z]{1}[A-Z]$") ){
            input = input.toLowerCase();
            System.out.println((char)(input.charAt(0)-32) + input.substring(1));
        }
        else {
            System.out.println(input);
        }
    }
}

package CodeForces;

import java.util.Scanner;

public class A59Word {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        System.out.println(word.chars().filter(c->c<97).count() * 2 > word.length() ? word.toUpperCase() : word.toLowerCase() );
    }
}

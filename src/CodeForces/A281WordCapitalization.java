package CodeForces;

import java.util.Scanner;

public class A281WordCapitalization {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        String resp = scan.next();
        System.out.println(resp.substring(0,1).toUpperCase() + resp.substring(1));
    }
}

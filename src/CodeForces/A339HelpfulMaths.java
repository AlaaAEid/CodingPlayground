package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class A339HelpfulMaths {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        String [] input = scan.nextLine().split("\\+");
        Arrays.sort(input);
        System.out.println(String.join("+",input));
    }
}

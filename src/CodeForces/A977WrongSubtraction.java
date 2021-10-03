package CodeForces;

import java.util.Scanner;

public class A977WrongSubtraction {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt(), k = scan.nextInt();
        while (k > 0) {
            if(num % 10 == 0) num /=10;
            else num --;
            k --;
        }

        System.out.println(num);
    }
}

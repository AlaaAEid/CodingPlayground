package CodeForces;

import java.util.Scanner;
import java.util.Stack;

public class A266StonesOnTheTable {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Character> stones = new Stack<>();
        stones.push(' ');
        scan.nextInt();
        String table = scan.next();
        int count =0;

        for (int i = 0 ; i < table.length() ; i ++) {
            if (stones.peek() == table.charAt(i)) {
                count ++;
            }else {
                stones.push(table.charAt(i));
            }
        }

        System.out.println(count);
    }
}

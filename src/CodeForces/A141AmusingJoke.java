package CodeForces;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Collectors;

public class A141AmusingJoke {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        String host = scan.next(), guest = scan.next(), jumble = scan.next();
        Stack<Character> s = jumble.chars().mapToObj(e->(char) e).collect(Collectors.toCollection(Stack::new));
        for (char c:
             host.toCharArray()) {
            s.
        }
    }
}

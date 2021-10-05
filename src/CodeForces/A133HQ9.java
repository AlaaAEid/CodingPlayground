package CodeForces;

import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class A133HQ9 {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        Set<Character> s = scan.next().chars()
                .filter(c-> c == 'H' || c == 'Q' || c == '9')
                .mapToObj(c->(char)c).collect(Collectors.toSet());
        System.out.println(s.size() > 0 ? "YES":"NO");
    }
}

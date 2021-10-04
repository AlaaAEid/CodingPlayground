package CodeForces;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class A110NearlyLucky {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        String in = scan.next();
        ArrayList<Character> chars = new ArrayList<Character>();
        for (char c : in.toCharArray()) {
            if(c == '4' || c =='7')
                chars.add(c);
        }
        System.out.println(isLuckyNumber(""+chars.size()) ? "YES" : "NO");
    }

    public static boolean isLuckyNumber(String number) {
        Set<Character> resp = number.chars()
                .mapToObj(e->(char)e).collect(Collectors.toSet());
        return resp.contains('4') || resp.contains('7') ;
    }
}

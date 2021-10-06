package CodeForces;

import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class A443AntonAndLetters {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        Set<Character> s = scan.nextLine()
                .replace(",","")
                .replace("{","")
                .replace("}","")
                .replace(" ","")
                .chars().filter(e->(char)e != '{' || e != '}').mapToObj(value -> (char)value).collect(Collectors.toSet());
        System.out.println(s.size());
    }
}

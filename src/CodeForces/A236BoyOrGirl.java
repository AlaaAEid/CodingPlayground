package CodeForces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A236BoyOrGirl {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in) ;
        String r = scan.next();
        Set<Character> characters = new HashSet<>();

        for (int i = 0 ; i < r.length() ; i ++)  {
            characters.add(r.charAt(i));
        }
        System.out.println(characters.size() % 2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!");
    }
}

package CodeForces;

import java.util.*;

public class A118StringTask {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        Set<Character> vowels = new HashSet<Character>(Arrays.asList('a', 'o', 'y', 'e', 'u', 'i'));
        String word = scan.next().toLowerCase();
        StringBuilder resp = new StringBuilder();
        for(int i = 0 ; i < word.length(); i ++) {
            if (!vowels.contains(word.charAt(i))) {
                resp.append(".").append(word.charAt(i));
            }
        }
        System.out.println(resp);
    }
}

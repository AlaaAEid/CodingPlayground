package CodeForces;

import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class A271BeautifulYear {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        year ++;
        while(!isDistinct(""+year)){
            year ++;
        }
        System.out.println(year);
    }

    public static boolean isDistinct(String year) {
        Set<Character> yearChars = year.chars().mapToObj(e->(char)e).collect(Collectors.toSet());
        return year.length() == yearChars.size();
    }
}

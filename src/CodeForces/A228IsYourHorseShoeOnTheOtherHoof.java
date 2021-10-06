package CodeForces;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A228IsYourHorseShoeOnTheOtherHoof {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        Set<Long> nums = new HashSet<Long>();
        nums.add(scan.nextLong());
        nums.add(scan.nextLong());
        nums.add(scan.nextLong());
        nums.add(scan.nextLong());

        System.out.println(4 - nums.size());
    }
}

package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class A479Expression {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt(),r[]={a+b+c,(a+b)*c,a*(b+c),a*b*c};
        Arrays.sort(r);
        System.out.print(r[3]);
    }
}

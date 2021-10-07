package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class A230Dragons {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt(), n = scan.nextInt();
        int [][] a = new int[n][2];
        boolean flg = true;
        for(int i = 0 ; i < n ; i ++ ){
            a[i][0] = scan.nextInt();
            a[i][1] = scan.nextInt();
        }
        Arrays.sort(a, new java.util.Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        });

        for(int i = 0 ; i < n ; i ++ ){
            if (s > a[i][0]) s+= a[i][1];
            else {
                flg = false;
                break;
            }
        }

        System.out.println(flg ? "YES" : "NO");
    }
}

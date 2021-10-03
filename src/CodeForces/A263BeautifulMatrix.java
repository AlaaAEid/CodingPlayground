package CodeForces;

import java.util.Scanner;

public class A263BeautifulMatrix {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);

        int index = 0;
        int moves = 0;
        while (index < 25){

            if (scan.nextInt() == 1) {
                moves = Math.abs( ( index / 5) - 2 ) + Math.abs(( index % 5) - 2 );
                break;
            }
            index ++;
        }

        System.out.println(moves);
    }
}

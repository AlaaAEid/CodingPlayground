package CodeForces;

import java.util.Scanner;

public class A158NextRound {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int [] players = new int [n];
        for (int i = 0; i < n ; i ++) players[i] = scan.nextInt();

        System.out.println(getWinners(k, players));
    }

    public static int getWinners(int k, int[] winners) {
        int count = 0;
        int rule = winners[k-1];
        for (int i = 0 ; i < winners.length ; i ++) {
            if ( winners[i] == 0){}
            else if(winners[i] >= rule){
                count ++;
            }
        }
        return count;
    }
}

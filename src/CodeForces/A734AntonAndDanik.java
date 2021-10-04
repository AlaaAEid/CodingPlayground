package CodeForces;
import java.util.Arrays;
import java.util.Scanner;

public class A734AntonAndDanik {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char [] games = scan.next().toCharArray();
        System.out.println(getWinner(games));
    }

    public static String getWinner(char [] games) {
        if (games.length == 1) {
            return games[0] == 'A' ? "Anton":"Danik";
        }

        int n = games.length;
        Arrays.sort(games);
        int index = 0;
        while(index < n) {
            if(games[index] != 'A') break;
            index ++;
        }

        if(index < (int)Math.ceil(n/2.0)){
            return "Danik";
        }else if (index > (int)Math.ceil(n/2.0)){
            return "Anton";
        }else {
            return "Friendship";
        }
    }
}

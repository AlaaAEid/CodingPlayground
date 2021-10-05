package CodeForces;

import java.util.*;

public class A136Presents {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Map<Integer,Integer> gifts = new HashMap<Integer,Integer>();
        for(int i = 1 ; i <= n ; i ++){
            gifts.put(scan.nextInt(),i);
        }

        StringBuilder str = new StringBuilder();
        for(int i = 1 ; i <= n ; i ++){
            str.append(" "+gifts.get(i));
        }

        System.out.println(str.toString().substring(1));
    }
}

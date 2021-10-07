package CodeForces;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class C4RegistrationSystem {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(),num;
        HashMap<String, Integer> db = new HashMap<>();
        String tmp ;

        while (n -- > 0) {
            tmp = scan.next();
            if(db.containsKey(tmp)){
                num = db.get(tmp);
                db.put(tmp, num + 1);
                System.out.println(tmp+(num +1));
            }else {
                db.put(tmp,0);
                System.out.println("OK");
            }
        }
    }
}

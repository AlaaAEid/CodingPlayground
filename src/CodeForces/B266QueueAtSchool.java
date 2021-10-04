package CodeForces;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B266QueueAtSchool {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt(), n = scan.nextInt();
        String str = scan.next();
        Queue<Character> line = new LinkedList<Character>();
        for (char c : str.toCharArray()) {
            line.add(c);
        }

        while (n > 0 ) {
            line = resolvePlaces(line, m);
            n --;
        }

        StringBuilder res = new StringBuilder();
        for (Object c : line.toArray()) {
            res.append((char) c);
        }

        System.out.println(res);
    }

    private static Queue<Character> resolvePlaces(Queue<Character> line, int size) {
        char top = ' ',next;
        Queue<Character> tmp = new LinkedList<Character>();

        for (int i = 0 ; i < size && !line.isEmpty(); i ++) {
            try {
                top = line.remove();
                if ( top == 'B' && line.peek() == 'G') {
                    next = line.remove();
                    tmp.add(next);
                    tmp.add(top);
                }else {
                    tmp.add(top);
                }
            } catch (NullPointerException e) {
                tmp.add(top);
            }
        }
        return tmp;
    }
}

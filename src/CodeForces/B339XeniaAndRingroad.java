package CodeForces;

import java.util.Scanner;

public class B339XeniaAndRingroad {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong(), m = scan.nextLong(),current = 1, next, steps = 0;
        while (m-- > 0) {
            next = scan.nextLong();
            if(next < current){
                steps += (n - current) + next;
            }else {
                steps += ( (next - current) % n );
            }
            current = next;
        }

        System.out.println(steps);
    }
}

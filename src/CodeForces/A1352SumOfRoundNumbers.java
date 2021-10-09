package CodeForces;

import java.util.Scanner;

public class A1352SumOfRoundNumbers {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), t, b=0 ,a=1;
        String ss;
        while(n -- > 0) {
            ss = "";
            a = 1;
            b = 0;
            t = scan.nextInt();
            while( t > 0) {
                if(t%10!=0){
                    b++;
                    ss+=(t%10*a+" ");
                }
                a*=10;
                t/=10;
            }
            System.out.println(b+"\n"+ss);
        }
    }
}

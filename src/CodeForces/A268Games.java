package CodeForces;

import java.util.Scanner;

public class A268Games {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();

        int[][] x=new int[n][2];
        for(int i=0;i<n;i++){
            x[i][0]=scan.nextInt();
            x[i][1]=scan.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(x[i][0]==x[j][1])
                    sum++;
            }
        }
        System.out.println(sum);
    }
}

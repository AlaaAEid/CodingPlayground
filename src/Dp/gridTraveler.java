package Dp;

public class gridTraveler {
    public static void main (String [] args) {

    }

    public static int getWays(int n, int m) {
        if ( n == 0 || m == 0 ) return 0;
        

        return getWays(n-1,m) + getWays(n,m-1);
    }
}

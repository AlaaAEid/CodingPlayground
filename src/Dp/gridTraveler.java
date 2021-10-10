package Dp;

public class GridTraveler {

    public static void main (String [] args) {
        System.out.println(gridTraveler(2,3));
    }

    public static int gridTraveler(int n, int m ) {
        if (n == 1 && m == 1) return 1;
        if (n == 0 || m == 0) return 0;

        return gridTraveler(n-1,m ) + gridTraveler(n,m-1);
    }
}

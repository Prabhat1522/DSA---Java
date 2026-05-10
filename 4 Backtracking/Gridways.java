public class gridWays {
    public static int gridWaysbacktrack(int i, int j, int n, int m) {
        //base case
        if(i==n-1 && j==m-1) { //condn for last cell
            return 1;
        } else if(i == n || j == n) { //boundary cross condn
            return 0;
        }
        
        int w1 = gridWaysbacktrack(i+1, j, n, m);
        int w2 = gridWaysbacktrack(i, j+1, n, m);
        return w1 + w2;
    }
    
    public static void main(String args[]){
        int n=3,m=4;
        System.out.println(gridWaysbacktrack(0, 0, n, m));
    }
}

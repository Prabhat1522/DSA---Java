public class Array2 {
    public static int bestIndx(int[] prices, int[] ratings) {
        int n = prices.length;
        double maxRatio = -1;
        int ansIndx = -1;
        for(int i=0;i<n;i++) {
            int small = Math.min(prices[i], ratings[i]);
            int big = Math.max(prices[i], ratings[i]);
            double ratio = (double) small / big;
            if(ratio > maxRatio) {
                maxRatio = ratio;
                ansIndx = i;
            }
        }
        return ansIndx;
    }
    public static void main(String[] args) {
        int[] prices = {6, 5, 4, 3};
        int[] ratings = {4, 3, 1, 2};
        System.out.println(bestIndx(prices, ratings));
    }
    
}

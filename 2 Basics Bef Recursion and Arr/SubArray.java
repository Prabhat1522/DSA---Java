public class SubArray {
    public static void printSubArrays(int n[]){
        int total = 0;
        for(int i=0;i<n.length;i++){
            int start = i;
            for(int j=i;j<n.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    System.out.print(n[k]+" ");
                }
                total++;
                System.out.println("");
            }
            System.out.println("");
        }
        System.out.println("Total subArrays = "+total);
    }
    public static void maxSubArray(int n[]){
        //int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++){
            int start=i;
            for(int j=i;j<n.length;j++){
                int end=j;
                int currSum=0;
                for(int k=start;k<=end;k++){
                    currSum += n[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum = "+maxSum);
    }

    public static void prefixSum(int n[]){
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[n.length];
        //calculate prefix array
        prefix[0]=n[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + n[i];
        }
        for(int i=0;i<n.length;i++){
            int start = i;
            for(int j=i;j<n.length;j++){
                int end=j;
                int currSum = start==0 ? prefix[end]:prefix[end]-prefix[start-1];
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum ="+maxSum);
    }

    public static void kadanes(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0;i<numbers.length;i++){
            currSum = currSum + numbers[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum,maxSum);
        }
        System.out.println("Our max subarray sum is : "+maxSum);
    }
    public static void main(String args[]){
        //int numbers[] = {2,4,6,8,10};
        //int numbers[] = {1, -2, 6, -1, 3};
        //printSubArrays(numbers);

        //maxSubArray(numbers);

        //prefixSum(numbers);

        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(numbers);

    }
    
}

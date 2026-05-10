public class RecursionBasics {

    public static void printDec(int n)
    {
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fn=n * fact(n-1);
        return fn;
    }

    public static int sumOfFirstNnaturalNo(int n){
        if(n==1){
            return 1;
        }
        int sum1 =  sumOfFirstNnaturalNo(n-1);
        int sn = n + sum1;
        return sn;
    }

    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static boolean isSorted(int arr[],int i)
    {
        if(i == arr.length-1)
        {
            return true;
        }
        if(arr[i]>arr[i+1])
        {
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static int firstOccurence(int arr[],int key,int i)
    {
        if(i == arr.length)
        {
            return -1;
        }
        if(arr[i]==key)
        {
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }

    public static int lastOccurence(int arr[],int key,int i)
    {
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    public static int power(int x,int n)
    {
        if(n == 0){
            return 1;
        }
        // int xnm1=power(x,n-1);
        // int xn=x*xnm1;
        // return xn;
        return x * power(x,n-1);
    }
    public static int optimizedPower(int a,int n)  //O(log n)
    {
        if(n == 0){
            return 1;
        }
        int halfPower = optimizedPower(a, n/2);
        int halfPowerSq = halfPower * halfPower;

        //if n is odd
        if(n % 2 != 0){
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static int tilingProblem(int n)  // 2 x n (floor size)
    {
        //base case
        if(n == 0 || n == 1)
        {
            return 1;
        }
        //kaam
        //vertical choice
        int fnm1 = tilingProblem(n-1);

        //horizontal choice
        int fnm2 =tilingProblem(n-2);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }

    public static void removeDuplicates(String str,int idx, StringBuilder newStr,boolean map[])
    {
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        //kaam
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true){
            //duplicate
            removeDuplicates(str,idx+1,newStr,map);
        }else {
            map[currChar-'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args)
    {
        //int n=10;
        //printDec(n);

        //printInc(n);

        //System.out.println(fact(5));

        //System.out.println(sumOfFirstNnaturalNo(10));

        // System.out.println(fib(14));
        // System.out.println(fib(15));

        // int arr[]={1,2,30,4,5};
        // System.out.println(isSorted(arr, 0));
        
        // int arr[]= {8,3,6,9,5,10,2,5,3};
        // //System.out.println(firstOccurence(arr, 5, 0));

        // System.out.println(lastOccurence(arr, 5, 0));

        //System.out.println(power(2, 5));

        //System.out.println(optimizedPower(2, 5));

        System.out.println(tilingProblem(5));

        //remove duplicates
        String str = "apnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);

    }
}

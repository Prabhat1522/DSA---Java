public class RecursionBasics {
    public static void printDec(int n) {
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+ " ");
        printDec(n-1);
    }
    public static void printInc(int n) {
        if(n == 1) {
            System.out.print(n+ " ");
            return;
        }
        printInc(n-1);
        System.out.print(n+ " ");
    }
    public static int fact(int n) {
        if(n == 0) {
            return 1;
        }
        int fnm1 = fact(n-1);
        int fN = n * fnm1;
        return fN;
    }
    public static int calcSum(int n) {
        if(n == 1) {
            return 1;
        }
        int snm1 = calcSum(n - 1);
        int sn = n + snm1;
        return sn;
    }
    public static int fib(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }
    public static boolean isSorted(int arr[], int i) {
        if(i == arr.length - 1) {
            return true;
        }
        if(arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static int firstOccurence(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1;
        }
        if(arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, key, i + 1);
    }
    public static int lastOccurence(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i + 1);
        if(isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }
    public static int power(int x, int n) {
        if(n == 0) {
            return 1;
        }
        // int xnm1 = power(x, n - 1);
        // int xn = x * xnm1;
        // return xn;
        return x * power(x, n - 1);
    }

    public static int opitimizedPower(int x, int n) {
        if(n == 0) {
            return 1;
        }
        int halfPower = opitimizedPower(x, n/2);
        int halfPowerSq = halfPower * halfPower;
        //n is odd
        if(n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }

    //Tiling problem
    public static int tilingProblem(int n) {
        //base case
        if(n == 0 || n == 1) {
            return 1;
        }
        //kaam
        int fnm1 = tilingProblem(n - 1); // vertical choice
        int fnm2 = tilingProblem(n - 2); // horizontal choice
        
        int totalways = fnm1 + fnm2;
        return totalways;
    }

    //Remove Duplicates from a string
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if(idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        //kaam
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true) {
            //duplicate
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);
        }
    }

    //friends pairing problem
    public static int friendsPairing(int n) {
        //base case
        if(n == 1 || n == 2) {
            return n;
        }
        // //kaam
        // //single
        // int fnm1 = friendsPairing(n - 1);
        // //pair
        // int fnm2 = friendsPairing(n - 2);
        // int pairWays = (n - 1) * fnm2;

        // int totalWays = fnm1 + pairWays;
        // return totalWays;
        return friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2);
    }

    //Binary String Problem
    public static void printBinStrings(int n, int lastPlace, String str) {
        if(n == 0) {
            System.out.println(str);
            return;
        }
        //kaam
        printBinStrings(n - 1, 0, str + "0");
        if(lastPlace == 0) {
            printBinStrings(n - 1, 1, str + "1");
        }
    }
    public static void main(String args[]){
        // int n = 10;
        // printDec(n);

        // System.out.println();
        // printInc(n);

        // System.out.println();
        // System.out.println(fact(5));

        // System.out.println(calcSum(5));

        // System.out.println(fib(23));

        // int arr[] = {1, 2, 5, 4};
        // System.out.println(isSorted(arr, 0));

        // int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        // System.out.println(firstOccurence(arr, 5, 0));
        // System.out.println(lastOccurence(arr, 5, 0));

        // System.out.println(power(2, 5));

         // System.out.println(opitimizedPower(2, 6));

        // System.out.println(tilingProblem(4));

        // String str = "appnacollege";
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);

        // System.out.println(friendsPairing(3));

        printBinStrings(3, 0, "");
        
    }
}
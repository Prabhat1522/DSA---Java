import java.util.*;
public class MinAbsoluteDiffPairs {
    public static void main(String[] args) {
        int A[] = {1,10,4,4,2,7};
        int B[] = {9,3,5,1,7,4};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;

        for(int i=0;i<A.length;i++) {
            minDiff += Math.abs(A[i] - B[i]);
        }

        System.out.println("Minimum Absolute Difference of pairs = " + minDiff);

    }
}

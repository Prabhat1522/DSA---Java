import java.util.*;
public class SumofSubArrayMinimums {
    public static int[] findNSL(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] nsl = new int[n];
        for(int i=0;i<n;i++) {
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            nsl[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return nsl;
    }
    public static int[] findNSR(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] nsr = new int[n];
        for(int i=n-1;i>=0;i--) {
            while(!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            nsr[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return nsr;
    }

    public static int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int mod = (int)(1e9 + 7);
        int nsl[] = findNSL(arr);
        int nsr[] = findNSR(arr);
        long total = 0;
        for(int i=0;i<n;i++) {
            long left = i - nsl[i];
            long right = nsr[i] - i;
            long contribution = (left * right * 1L * arr[i]) % mod;
            total = (total + contribution) % mod;
        } 
        return (int) total;
    }
    public static void main(String[] args) {
        int arr[] = {3, 1, 2, 4};
        System.out.println(sumSubarrayMins(arr));
    }
}

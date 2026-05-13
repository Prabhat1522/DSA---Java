import java.util.*;
public class SumofSubArrayMaximums {
    public static int[] findNGL(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ngl = new int[n];
        for(int i=0;i<n;i++) {
            while(!st.isEmpty() && arr[st.peek()] < arr[i]) {
                st.pop();
            }
            ngl[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return ngl;
    }
    public static int[] findNGR(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ngr = new int[n];
        for(int i=n-1;i>=0;i--) {
            while(!st.isEmpty() && arr[st.peek()] < arr[i]) {
                st.pop();
            }
            ngr[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return ngr;
    }

    public static int sumSubarrayMax(int[] arr) {
        int n = arr.length;
        int mod = (int)(1e9 + 7);
        int nsl[] = findNGL(arr);
        int ngr[] = findNGR(arr);
        long total = 0;
        for(int i=0;i<n;i++) {
            long left = i - nsl[i];
            long right = ngr[i] - i;
            long contribution = (left * right * 1L * arr[i]) % mod;
            total = (total + contribution) % mod;
        } 
        return (int) total;
    }
    public static void main(String[] args) {
        int arr[] = {8, 0, 1};
        System.out.println(sumSubarrayMax(arr));
    }
}

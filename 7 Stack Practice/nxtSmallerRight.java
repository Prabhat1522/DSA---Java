import java.util.*;
public class nxtSmallerRight {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int arr[] = {4, 5, 2, 10, 8};
        int nself[] = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--) {
            while(!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }
            nself[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }
        for(int i=0;i<arr.length;i++) {
            System.out.print(nself[i]+ " ");
        }
    }
}

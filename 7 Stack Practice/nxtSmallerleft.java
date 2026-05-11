import java.util.*;
public class nxtSmallerleft {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int arr[] = {4, 5, 2, 10, 8};
        int nself[] = new int[arr.length];
        for(int i=0;i<arr.length;i++) {
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

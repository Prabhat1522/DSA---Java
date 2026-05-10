public class testCaseAssignment {
    public static boolean duplicateElement(int num[]){
        int n=num.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;i<n;j++){
                if(num[i] == num[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int num[] = {1, 2, 3, 4, 5};
        System.out.println(duplicateElement(num));

    }
    
}

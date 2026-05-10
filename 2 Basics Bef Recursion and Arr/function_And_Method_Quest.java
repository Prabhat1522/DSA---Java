public class function_And_Method_Quest {
    static boolean isEven(int n){
        if(n%2==0){
            return true;
        }else{
            return false;
        }
    }

    public static int sum_Of_Digits(int n){
        int temp = n,sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        return sum;
    }


    public static void main(String args[]){
        // boolean result = isEven(10);
        // System.out.println(result);

        int result1 = sum_Of_Digits(135);
        System.out.println("135 sum of digits: "+result1);
    }
    
}

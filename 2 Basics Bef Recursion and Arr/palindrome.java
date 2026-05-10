import org.w3c.dom.ls.LSOutput;

public class palindrome {
    public static boolean isPalindrome(int n){
        int rev = 0,temp = n;
        while(n > 0){
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit; 
            n = n / 10;
        }
        if(temp == rev){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        boolean result1 = isPalindrome(123421);
        System.out.println(result1);

        boolean result2 = isPalindrome(1221);
        System.out.println(result2);
    }
}


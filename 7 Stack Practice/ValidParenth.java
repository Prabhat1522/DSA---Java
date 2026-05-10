import java.util.*;

public class ValidParenth {
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            //opening 
            if(ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            }
            else {
                //closing
                if(s.isEmpty()) {
                    return false;
                } 
                if( (ch == ')' && s.peek() == '(')
                     || (ch == '}' && s.peek() == '{')
                     || (ch == ']' && s.peek() == '[')
                ){
                    s.pop();
                }
            }
        }
        return s.isEmpty();
    }

    public static void main(String args[]) {
        String str = "({})[]"; //true
        System.out.println(isValid(str));
    }
    
}

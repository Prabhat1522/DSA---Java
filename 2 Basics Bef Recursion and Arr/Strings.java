import java.util.*;
public class Strings {
    public static boolean isPalindrome(String str){
        int n = str.length();
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(n-i-1)){ //not a palindrome
                return false;
            }
        }
        return true;

    }

    public static float getShortestPath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char direction=path.charAt(i);
            //south
            if(direction == 'S'){
                y--;
            }else if(direction == 'N'){
                y++;
            }else if(direction == 'W'){
                x--;
            }else{
                x++;
            }
        }
        int x2 = (x*x);
        int y2 = (y*y);

        return (float)Math.sqrt(x2 + y2);
    }

    public static String substring(String str, int si, int ei){
        String substr = "";
        for(int i=si;i<ei;i++){
            substr += str.charAt(i);
        }
        return substr;
    }

    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == ' '&& i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String compress(String str){
        String newStr="";
        for(int i=0;i<str.length();i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count > 1){
                newStr += count.toString();
            }
        }
        return newStr;
    }

    public static void main(String args[]){
        // char arr[]={'a','b','c','d'};
        // String str = "abcd";
        // String str2 = new String("xyz");

        // //Strings are IMMUTABLE
        // Scanner sc = new Scanner(System.in);
        // String name;
        // System.out.print("Enter your name: ");
        // name = sc.nextLine();
        // System.out.println("Entered name is: "+name);
        // System.out.println("Length of your: "+name.length());
        // System.out.println(name.charAt(0));


        //check Palindrome
        // String str = "racecar";
        // System.out.println(isPalindrome(str));

        //get shortest distance
        // String path = "NSN";
        // System.out.println(getShortestPath(path));

        //find the largest string
        // String fruits[]={"apple","mango","banana"};

        // String largest = fruits[0];
        // for(int i=1;i<fruits.length;i++){
        //     if(largest.compareTo(fruits[i]) < 0){
        //         largest = fruits[i];
        //     }
        // }
        // System.out.println(largest);

        //to upper case
        // String str = "hi, i am shradha";
        // System.out.println(toUpperCase(str));

        //String compression
        String str = "aaabbbccccd";
        System.out.println(compress(str));


    }
    
}

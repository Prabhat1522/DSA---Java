import java.util.*; 
public class JavaBasics {
    public static void main(String args[]) {
        // System.out.println("hello to java world satrt");
        // System.out.println("1 2 3 4 5");
        // System.out.println("****");
        // System.out.println("***");
        // System.out.println("**");
        // System.out.println("*");
        // int a=10;
        // int b=5;
        // System.out.println(a);
        // System.out.println(b);
        // String name="tony stark";
        // System.out.println(name);
        
        // a=50;
        // System.out.println(a);

        // byte b = 8;
        // System.out.println(b);
        // char ch='a';
        // System.out.println(ch);
        // boolean var=true;
        // System.out.println(var);
        // float price = 10.5f;
        // System.out.println(price);
        // int 
        // long
        // double

        //sum of two numbers
        // int a=10;
        // int b=5;
        // int sum = a + b;
        // System.out.println("The sum of " + a + " and " + b + " is: " + sum);


        //largetst of three numbers

        // int a=6,b=3,c=1;
        // if(a>=b && a>=c) {
        //     System.out.println("a is the largest number");
        // } else if(b>=a && b>=c) {
        //     System.out.println("b is the largest number");
        // } else {
        //     System.out.println("c is the largest number");
        // }

        //Ternary operator
        //check if a student pass or fail
        // int marks=50;
        // String reportCard = marks >= 33 ? "PASS" : "FAIL";
        // System.out.println(reportCard);

        //switch statement
        // int num=2;
        // switch(num){
        //     case 1:
        //         System.out.println("samosa");
        //         break;
        //     case 2:
        //         System.out.println("burger");
        //         break;
        //     case 3:
        //         System.out.println("papaya shake");
        //         break;
        //     default:
        //         System.out.println("we woke up");
        //         break;
        // }

        //calculator using operator
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a : ");
        int a=sc.nextInt();
        System.out.println("Enter b : ");
        int b=sc.nextInt();
        System.out.println("Enter operator : ");
        char operator=sc.next().charAt(0);
        switch(operator){
            case '+':
            System.out.println(a+b);
            break;
            case '-':
            System.out.println(a-b);
            break;
            case '*':
            System.out.println(a*b);
            break;
            case '/':
            System.out.println(a/b);
            break;
            case '%':
            System.out.println(a%b);
            break;
            default : 
            System.out.println("wromg input");

        }

    }
}
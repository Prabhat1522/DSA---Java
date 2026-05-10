import java.util.*;
public class conditional{
    public static void main(String args[]){
        // //Age wala condn;;
        // System.out.println("Enetr the age:");
        // Scanner sc=new Scanner(System.in);
        // int age=sc.nextInt();
        // if(age>18){
        //     System.out.println("Adult");
        // }
        // else{
        //     System.out.println("Not Adult");
        // }

        //Odd even and number comparison
        System.out.print("Enetr two number: ");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if(num1==num2){
            System.out.println("both are equal.");
        }
        else if(num1>num2){
            System.out.println("num1 is greater."); 
        }
        else{
            System.out.println("num2 is greater.");
        }
    }
}
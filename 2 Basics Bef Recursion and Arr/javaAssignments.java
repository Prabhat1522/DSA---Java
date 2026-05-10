import java.util.*; 
public class javaAssignments {
    public static void main(String[] args){

        //Positive negative number
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the number: ");
        // int num=sc.nextInt();
        // if(num>=0){
        //     System.out.println("Number is Positive");
        // }else{
        //     System.out.println("negative");
        // }

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter weekday : ");
        int week=sc.nextInt();
        switch(week){
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thrusday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("saturday");
            break;
            case 7:
            System.out.println("sunday");
            break;
            default:
            System.out.println("wrong input");

        }






    }
}

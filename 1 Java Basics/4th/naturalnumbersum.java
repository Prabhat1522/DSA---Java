import java.util.*;
public class naturalnumbersum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr the num:");
        int num=sc.nextInt();
        int sum=0;
        for(int i=0;i<=num;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}

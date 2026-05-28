import java.util.*;
public class problem1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        int sum=0;
        for(int i=0;i<=num;i++){
            sum+=1;
        }
        System.out.print("the sum is "+sum);
        sc.close();
        
        
    }
}
import java.util.*;
class Armstrong
{
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         int n;
         System.out.println("Enter a number: ");
         n=sc.nextInt();
         int rem=0;
         int sum=0;
         int copy=n;
         while(n!=0)
         {
             rem=n%10;
             sum=sum+(rem*rem*rem);
             n=n/10;
         }
         if(copy==sum)
         {
            System.out.print("It's an Armstrong number!");
         }
         else{
             System.out.print("Not Armstrong!");
         }
        }
    }


    

import java.io.*;
import java.util.*;
public class Palindrome 
{
    public static void main(String ar[])
    {
       Scanner scanf=new Scanner(System.in);
       System.out.print("enter the number to check whether its a palindrome or not:");
       int a=scanf.nextInt();
       int res=check(a);
       if(res==a)
       {
        System.out.println("yeah its a palindrome number");
       } 
       else{
        System.out.println("hey it's not a palindrome number");
       }

    }    
    static int check(int a)
    {
        int num=0;
        int rem;
        while(a!=0)
        {
            rem=a%10;
            num=num*10+rem;
            a=a/10;
        }
        System.out.println(num);
        return num;

    } 
}

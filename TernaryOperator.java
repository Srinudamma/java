import java.io.*;
import java.util.*;
public class TernaryOperator 
{
    public static void main(String ar[])
    {
     Scanner obj=new Scanner(System.in);
     System.out.println("enter number");
     int a=obj.nextInt();
     String res=(a%2==0)? "even":"false";
     System.out.println(res);

    }   
}

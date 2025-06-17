import java.io.*;
import java.util.*;
class EvenOddZero
{
    public static void main(String ar[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter number");
        int a=obj.nextInt();
        if(a==0)
        {
            System.out.println("it is zero");
        }
        else if(a%2==0)
        {
            System.out.println("it is an even number");
        }
        else
        {
            System.out.println("it is an odd number");
        }
    }
}

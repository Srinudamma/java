import java.io.*;
import java.util.*;
class PrimeNumber
{
    static int checkprime(int a)
    {
        for(int i=2;i<a;i++)
        {
            if(a%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
    static void primenum(int b)
    {
        if(b<2)
        {
            System.out.println(b +"is not a prime number");
        }
        else if(b==2)
        {
            System.out.println(b+" is a prime number");
        }
        else
        {
            int c=checkprime(b);
            if(c==1)
            {
                System.out.println("it is a prime number");
            }
            else{
                System.out.println("it is not a prime number");
            }
        }
    }
    public static void main(String ar[])
    {
        Scanner scanf=new Scanner(System.in);
        System.out.print("enter number to check whether it is prime or not");
        int num=scanf.nextInt();
        primenum(num);
    }
}
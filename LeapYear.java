
import java.io.*;
import java.util.*;
class LeapYear
{
    static void leapyear(int year)
    {
        if(year%4==0)
        {
            System.out.println("leap year");
        }
        
        else if(year%4==0 && year%100==0)
        {
            System.out.println("not a leap year");
        }
        else if(year%400==0)
        {
            System.out.println("leap year");
        }
        else
        {
            System.out.println("not a leap year");
        }

    }
    public static void main(String ar[])
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        leapyear(a);
    }
}
import java.io.*;
import java.util.*;
public class Switchcase 
{
    public static void main(String ar[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("on which day you want leave guess the day number i will tell you the day");
        int n=obj.nextInt();
        switch(n)
        {
            case 1:
             System.out.println("monday");
             break;
            case 2:
              System.out.println("tuesday");
              break;
            case 3:
              System.out.println("wednesday");
              break;
            case 4:
               System.out.println("thursday");
               break;
            case 5:
               System.out.println("friday");
               break;
            case 6:
               System.out.println("saturday");
               break;
            case 7:
               System.out.println("sunday");
               break;
        }
    }    
}

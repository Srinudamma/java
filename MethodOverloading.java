/*
 * This program demonstrates method overloading in Java.
 * 
 * Multiple 'add()' methods are defined with different parameter lists:
 *    - Two integers
 *    - Three integers
 *    - Two double values
 *
 * The program shows how the Java compiler selects the appropriate version
 * of the 'add()' method based on the number and types of arguments passed.
 */
import java.io.*;
import java.util.*;
class MethodOverloading
{
    void add(int a,int b)
    {
        System.out.println(a+b);
    }
    void add(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
    void add(double a,double b)
    {
        System.out.println(a+b);
    }
    public static void main(String ar[])
    {
        Scanner scanf=new Scanner(System.in);
        System.out.print("enter a value:");
        int a=scanf.nextInt();
        System.out.print("enter b value:");
        int b=scanf.nextInt();
        System.out.print("enter c value:");
        int c=scanf.nextInt();
        MethodOverloading obj=new MethodOverloading();
        obj.add(a,b);
        obj.add(a,b,c);
        obj.add(2.5,3.5);
    }
}

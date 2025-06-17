/**
 * This Java program generates and prints the first 100 Fibonacci numbers.
 * The Fibonacci sequence starts with 0 and 1, and each subsequent number
 * is the sum of the previous two numbers.
 * 
 * Example output: 0,1,1,2,3,5,8,...
 */
import java.io.*;
public class Fibonacci 
{
    static long fibonacci(long a,long b)
    {
        long c=a+b;
        System.out.print(c+",");
        return c;  
    }
 public static void main(String ar[])
 {
    long a=0;
    long b=1;
    int i=0;;
    System.out.print(a+",");
    System.out.print(b+",");
    while(i<100)
    {
        long d=fibonacci(a,b);
        a=b;
        b=d;
        i++;
    }

 }
}

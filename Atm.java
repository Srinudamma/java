/**
 * This Java program simulates basic ATM operations for a user.
 * It allows the user to:
 *  - Deposit money (with a minimum deposit limit)
 *  - Withdraw money (with sufficient balance check)
 *  - Check the current account balance
 * 
 * The user can choose the type of account (Savings or Current), though currently
 * both types are handled the same way using a single balance variable.
 * 
 * The program runs in a loop, continuously prompting the user for operations,
 * mimicking a basic ATM interface in the console.
 */

import java.io.*;
import java.util.*;
public class Atm{
    public static void main(String[] args)
    {
        Scanner scanf = new Scanner(System.in);
        while(true)
        {
            AtmServices as= new AtmServices();
            System.out.println("welcome "+ "\n" +   "1.deposit" + "\n" + "2.withdrawl" + "\n" + "3.balance enquiry");
            int choice=scanf.nextInt();
            System.out.println("please select your account type " +"\n" + "1.savings" + "2.current");
            int accountType=scanf.nextInt();
            switch(choice)
            {
                case 1:
                if(accountType==1)
                {
                    as.deposit();
                    break;
                }
                as.deposit();
                break;
                case 2:
                if(accountType==1)
                {
                    as.withdrawl();
                    break;
                }
                as.withdrawl();
                break;
                case 3:
                as.checkbalance();
                break;
                default:
                System.out.println("please select a service");
                break;
            }
            
        }
    }
}
class AtmServices{
    private static int AccountBalance=0;
    Scanner sc=new Scanner(System.in);
    public  void deposit()
    {
        System.out.println("please enter the amount to deposit:");
        int depositAmount=sc.nextInt();
        if(depositAmount>=100){
        AccountBalance+=depositAmount;
        System.out.println("Amount deposited Succesfully");
        }
        else{
        System.out.println("enter amount greater or equal to 100 ");
        }
    }
    public  void withdrawl()
    {
        System.out.println("please enter the amount in multiples of 100");
        int withdrawlAmount=sc.nextInt();
        if(withdrawlAmount<=AccountBalance)
        {
            AccountBalance-=withdrawlAmount;
            System.out.println("your withdrawl is successful");

        }
        else{
        System.out.println("you are unable to make transaction"+"\n"+ "please check you account balance");}
    }
    public  void checkbalance()
    {
        System.out.println("Available balance is " + AccountBalance);
    }
}

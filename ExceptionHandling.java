/**
 * This Java program demonstrates basic exception handling.
 * It prompts the user to enter a number and attempts to divide 10 by that number.
 * If the user enters 0, an ArithmeticException is caught.
 * Any other unexpected exceptions are caught by a general Exception handler.
 * The scanner is closed using a finally block to ensure proper resource handling.
 */

import java.util.*;
public class ExceptionHandling 
{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.print("Enter a number: ");
                int number = scanner.nextInt();
                int result = 10 / number;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed.");
            } catch (Exception e) {
                System.out.println("Error: An unexpected error occurred.");
            } finally {
                scanner.close();
            }
        }
    }

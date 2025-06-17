/**
 * This program checks whether a given year is a leap year.
 * A leap year is:
 * - Divisible by 4
 * - Not divisible by 100 unless also divisible by 400
 */

import java.util.*;

class LeapYear {

    // Method to check leap year
    static void leapyear(int year) {
        if (year % 400 == 0) {
            System.out.println("Leap year");
        } else if (year % 100 == 0) {
            System.out.println("Not a leap year");
        } else if (year % 4 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }

    public static void main(String ar[]) {
        Scanner obj = new

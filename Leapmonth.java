/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.leapmonth;

/**
 *
 * @author faith
 */
import java.util.Scanner;

public class Leapmonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt user to enter a year
        System.out.println("Enter a year:");
        int year = input.nextInt();

        // prompt user to enter a month
        System.out.println("Enter a month:");
        int month = input.nextInt();

        // check if the month is a leap month
        boolean isLeapMonth = (year % 4 == 0) && (month % 100 != 0) || (month % 400 == 0);

        // Display whether the month is a leap month
        if (isLeapMonth) {
            System.out.println("The month " + month + " of the year " + year + " is a leap month.");
        } else {
            System.out.println("The month " + month + " of the year " + year + " is not a leap month.");
        }

        input.close();
    }
}

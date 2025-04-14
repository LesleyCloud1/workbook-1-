package com.pluralsight; // Make sure your folder matches this package name

import java.util.*;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner basicCal = new Scanner(System.in); // Scanner to read input

        // Prompt the user to enter the first number
        System.out.print("Enter number 1: ");
        float num1 = basicCal.nextFloat();

        // Prompt the user to enter the second number
        System.out.print("Enter number 2: ");
        float num2 = basicCal.nextFloat();

        // Display the operation options
        System.out.println("What do you want to do?");
        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        // Ask the user to choose an option
        System.out.print("Please select an option: ");
        String operation = basicCal.next(); // FIXED: used correct Scanner object

        // For now, we always multiply no matter what the user picks
        float result = num1 * num2;

        // Show the result
        System.out.println(num1 + " * " + num2 + " = " + result);

        // Close the scanner (good practice)
        basicCal.close();
    }
}

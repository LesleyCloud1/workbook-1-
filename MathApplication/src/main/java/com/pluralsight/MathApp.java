package com.pluralsight; // This is the package name where your class lives

// This is your class definition - everything happens inside this class
public class MathApp {

    // This is the main method where your program starts running
    public static void main(String[] args) {

        // Declare two integer variables for Bob's and Gary's salaries
        int bobSalary = 55000;
        int garySalary = 100000;

        // Use Math.max() to find the higher salary between the two
        int highestSalary = Math.max(bobSalary, garySalary);

        // Print out the highest salary
        System.out.println("The highest salary is " + highestSalary);

        // Print a divider line to separate output sections
        System.out.println("------------------------------------------------------");

        // Declare a double variable x with a value of 7.25
        double x = 7.25;

        // Calculate the area of a circle using the formula π * r^2
        double area = Math.PI * Math.pow(x, 2); // Math.PI is π, and Math.pow(x, 2) is x squared

        // Print out the area of the circle
        System.out.println("Area of the circle: " + area);

        // Divider for next section
        System.out.println("------------------------------------------------------");

        /*
         * Find and display the square root of a number
         */

        // Declare a number and assign 5.0 to it
        double number = 5.0;

        // Use Math.sqrt() to find the square root
        double squareroot = Math.sqrt(number);

        // Print a divider
        System.out.println("------------------------------------------------------");

        // Print the square root using the variable
        System.out.println("The squareroot of " + number + " is " + squareroot);

        // Print the square root directly using Math.sqrt()
        System.out.println("The square root of " + number + " is " + Math.sqrt(5));

        // Divider for next section
        System.out.println("------------------------------------------------------");

        /*
         * Calculate the distance between two points (x1, y1) and (x2, y2)
         * using the distance formula: √((x2 - x1)^2 + (y2 - y1)^2)
         */

        // Declare coordinates for two points
        int x1 = 5;
        int x2 = 85;
        int y1 = 10;
        int y2 = 50;

        // Use Math.pow() and Math.sqrt() to calculate the distance
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Print the calculated distance
        System.out.println("The distance is: " + distance);

        // Divider for next section
        System.out.println("------------------------------------------------------");

        /*
         * Find and display the absolute value (positive version) of a number
         */

        // Declare a variable with a negative value
        double xVal = -3.8;

        // Use Math.abs() to find the absolute value
        double absValue = Math.abs(xVal);

        // Print the absolute value
        System.out.println("The absolute value of " + xVal + " is " + absValue);
    } // End of main method
} // End of class



package com.pluralsight;
import java.util.Scanner;
public class SanwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt fdr sandwich size
        System.out.println("Welcome to the Sandwich Shop!");
        System.out.println("Enter Sanwich size (1 for Regular - $5.45, 2 for Large - $8.95): " );
        int size = scanner.nextInt();;
        scanner.nextLine();

        //Get Price
        double basePrice;
        if (size == 1) {
            basePrice = 5.45;
        } else if (size ==2) {
            basePrice = 8.95;
        } else {
            System.out.println("Invalid size selection. Please enter 1 or 2.");
            return;
        }
        // Step 2: Ask if they want it loaded
        System.out.print("Would you like the sandwich loaded? (yes/no): ");
        String loaded = scanner.nextLine().trim().toLowerCase();

        if (loaded.equals("yes")) {
            if (size == 1) {
                basePrice += 1.00;
            } else {
                basePrice += 1.75;
            }
        }

        // Prompt for age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Calculate discount
        double discount = 0.0;
        if (age <= 17) {
            discount = 0.10;
        } else if (age >= 65) {
            discount = 0.20;

        }
        // Calculate final price
        double finalPrice = basePrice - (basePrice * discount);
        // Display the cost
        System.out.printf("Your sandwich costs: $%.2f%n", finalPrice);

        scanner.close();
    }
}

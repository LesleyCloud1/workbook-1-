package com.pluralsight;
import java.util.Scanner;
public class RentalCarCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants
        final double BASE_RATE = 29.99;
        final double TOLL_TAG_RATE = 3.95;
        final double GPS_RATE = 2.95;
        final double ROADSIDE_RATE = 3.95;
        final double UNDERAGE_SURCHARGE_RATE = 0.30;

        //Input
        System.out.println("Enter pickup date (MM/DD/YYYY): ");
        String pickupDate = scanner.nextLine();

        System.out.println("Enter number of rental days: ");
        int rentalDays = scanner.nextInt();
        scanner.nextLine(); //for new line

        System.out.println("Do you want an electronic toll tag? (y/n)");
        String tollTag = scanner.nextLine().trim().toLowerCase();

        System.out.println("Do you want a GPS? (y/n)");
        String gps = scanner.nextLine().trim().toLowerCase();

        System.out.println("Do you want roadside assistance? (y/n)");
        String roadside = scanner.nextLine().trim().toLowerCase();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Calculate basic rental
        double basicRental = BASE_RATE * rentalDays;

        // Calculate add on options
        double optionsCost = 0;
        if (tollTag.equals("y")) {
            optionsCost += TOLL_TAG_RATE * rentalDays;
        }
        if (gps.equals("y")) {
            optionsCost += GPS_RATE * rentalDays;
        }
        if (roadside.equals("y")) {
            optionsCost += ROADSIDE_RATE * rentalDays;
        }

        // Calculate underage surcharge
        double underageSurcharge = 0;
        if (age <25) {
            underageSurcharge = basicRental * UNDERAGE_SURCHARGE_RATE;
        }
        // Total cost
        double totalCost = basicRental + optionsCost + underageSurcharge;

        // Output
        System.out.println("\n----Rental Summary----");
        System.out.println("Pickup Date: " + pickupDate);
        System.out.printf("Basic Car Rental: $%.2f%n", basicRental);
        System.out.printf("Options Cost: $%.2f%n", optionsCost);
        System.out.printf("Underage Surcharge: $%.2f%n", underageSurcharge);
        System.out.printf("Total Cost: $%.2f%n", totalCost);

        scanner.close();
    }
}
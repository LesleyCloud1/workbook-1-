package PayrollCalculator; // Only if you're using a package — otherwise remove this line

import java.util.Scanner; // ✅ This is the missing piece!

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter hours worked: ");
        float hoursWorked = input.nextFloat();

        System.out.print("Enter your pay rate: ");
        float payRate = input.nextFloat();

        float grossPay = hoursWorked * payRate;

        System.out.println("-------------------------------------");
        System.out.println("Employee Name: " + name);
        System.out.println("Gross Pay: $" + grossPay);

        input.close();
    }
}

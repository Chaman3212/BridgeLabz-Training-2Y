package Assignment3;

public import java.util.Scanner;

// Class to compute sum of digits of a number using an array
public class SumOfDigits {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        // Validate input
        if (number < 0) {
            System.err.println("Invalid number. Must be positive.");
            input.close();
            return;
        }

        // Count digits
        int temp = number;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Store digits in array
        int[] digits = new int[count];
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Calculate sum
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }

        // Display result
        System.out.println("Sum of digits = " + sum);

        input.close();
    }
}

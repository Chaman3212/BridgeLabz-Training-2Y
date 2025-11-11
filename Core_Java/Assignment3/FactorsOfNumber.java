package Assignment3;

public import java.util.Scanner;

// Program to find factors of a number
public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input. Must be positive.");
            input.close();
            return;
        }

        // Dynamic array simulation
        int maxSize = 10;
        int[] factors = new int[maxSize];
        int index = 0;

        // Find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxSize) {
                    // Resize array
                    maxSize *= 2;
                    int[] temp = new int[maxSize];
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }
                factors[index++] = i;
            }
        }

        // Print factors
        System.out.print("Factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        input.close();
    }
}


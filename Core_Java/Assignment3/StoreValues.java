package Assignment3;

public import java.util.Scanner;

// Program to store up to 10 values or until user enters 0/negative
public class StoreValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // Infinite loop to take values
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = input.nextDouble();

            if (num <= 0 || index == numbers.length) {
                break;
            }

            numbers[index] = num;
            index++;
        }

        // Display values and total
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }

        System.out.println("\nTotal sum = " + total);

        input.close();
    }
}
 {
    
}

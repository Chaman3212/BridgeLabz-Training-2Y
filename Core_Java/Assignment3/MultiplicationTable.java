package Assignment3;

public import java.util.Scanner;

// Program to display multiplication table of a number
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get number
        System.out.print("Enter a number for multiplication table: ");
        int number = input.nextInt();

        // Validate
        if (number <= 0) {
            System.out.println("Invalid number. Enter a positive number.");
            input.close();
            return;
        }

        // Store results in array
        int[] table = new int[10];
        for (int i = 0; i < table.length; i++) {
            table[i] = number * (i + 1);
        }

        // Display results
        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }

        input.close();
    }
}
 {
    
}

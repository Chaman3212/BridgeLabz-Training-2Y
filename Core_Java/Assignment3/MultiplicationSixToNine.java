package Assignment3;

public // Program to print multiplication tables from 6 to 9
public class MultiplicationSixToNine {
    public static void main(String[] args) {
        int[][] tables = new int[4][10]; // 6–9 tables, each up to 10

        // Store results
        for (int num = 6; num <= 9; num++) {
            for (int i = 1; i <= 10; i++) {
                tables[num - 6][i - 1] = num * i;
            }
        }

        // Display results
        for (int num = 6; num <= 9; num++) {
            System.out.println("\nMultiplication Table of " + num);
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " * " + i + " = " + tables[num - 6][i - 1]);
            }
        }
    }
}
 {
    
}

package Assignment3;

public import java.util.Scanner;

// Program to calculate mean height of football players
public class MeanHeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] heights = new double[11];
        double sum = 0.0;

        // Take input
        System.out.println("Enter heights of 11 players:");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextDouble();
            sum += heights[i];
        }

        // Mean = total / count
        double mean = sum / heights.length;
        System.out.println("Mean height of players = " + mean);

        input.close();
    }
}
 {
    
}

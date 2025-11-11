import java.util.Random;

public class HeightsUtility {

    public static int getRandomHeight() {
        Random random = new Random();
        return random.nextInt(101) + 150;  // 150 to 250
    }

    // Create an array of heights for given players
    public static int[] generateHeightsArray(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = getRandomHeight();
        }
        return heights;
    }

    // Find sum of all heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Find mean height
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    // Find shortest height
    public static int findShortest(int[] heights) {
        int shortest = Integer.MAX_VALUE;
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    // Find tallest height
    public static int findTallest(int[] heights) {
        int tallest = Integer.MIN_VALUE;
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }
}

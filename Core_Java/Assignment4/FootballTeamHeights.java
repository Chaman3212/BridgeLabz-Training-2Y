public public class FootballTeamHeights {

    public static void main(String[] args) {
        int numberOfPlayers = 11;

        // Generate heights array
        int[] heights = HeightsUtility.generateHeightsArray(numberOfPlayers);

        // Display heights of players
        System.out.print("Heights of players: ");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println();

        // Use utility methods
        int sum = HeightsUtility.findSum(heights);
        double mean = HeightsUtility.findMean(heights);
        int shortest = HeightsUtility.findShortest(heights);
        int tallest = HeightsUtility.findTallest(heights);

        // Display results
        System.out.println("\nTotal Sum of Heights: " + sum + " cm");
        System.out.println("Mean Height: " + String.format("%.2f", mean) + " cm");
        System.out.println("Shortest Height: " + shortest + " cm");
        System.out.println("Tallest Height: " + tallest + " cm");
    }
}
 {
    
}

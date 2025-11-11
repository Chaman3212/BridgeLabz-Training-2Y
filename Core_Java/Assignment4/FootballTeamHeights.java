 public class FootballTeamHeights {

    public static void main(String[] args) {
        int numberOfPlayers = 11;

        int[] heights = HeightsUtility.generateHeightsArray(numberOfPlayers);

        System.out.print("Heights of players: ");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println();

        int sum = HeightsUtility.findSum(heights);
        double mean = HeightsUtility.findMean(heights);
        int shortest = HeightsUtility.findShortest(heights);
        int tallest = HeightsUtility.findTallest(heights);

        System.out.println("\nTotal Sum of Heights: " + sum + " cm");
        System.out.println("Mean Height: " + String.format("%.2f", mean) + " cm");
        System.out.println("Shortest Height: " + shortest + " cm");
        System.out.println("Tallest Height: " + tallest + " cm");
    }
}
 

import java.util.Random;
public class FootballTeamHeight {
	public static void main(String[] args) {                  
     		// creating an array to store heights of 11 players
		int[] heights = new int[11]; 
		
		// using method to generate random heights for players
		Random randomHeights = new Random();
		for (int i = 0; i < heights.length; i++) {
			// Random height between 150 and 250 cms
			heights[i] = randomHeights.nextInt(101) + 150; 
		}
		// Find shortest, tallest, and mean height
		int shortest = findTheShortest(heights);
		int tallest = findTheTallest(heights);
		double mean = findTheMean(heights);
		
		// print results
		System.out.println("Shortest player height: " + shortest + "cms");
		System.out.println("Tallest player height: " + tallest + " cms");
		System.out.println("Mean height of players: " + mean + " cms");
	}
	
	// Method to find the sum of all elements in the array
	public static int findTheSum(int[] arr) {
		int sum = 0;
		for (int i=0 ;i<arr.length;i++) {
			sum += arr[i];
		}
		return sum;
	}
		
	// Method to find the mean height of the players
	public static double findTheMean(int[] arr) {
		return (double) findTheSum(arr) / arr.length;
	}
	
	// Method to find the shortest height of the players
	public static int findTheShortest(int[] arr) {
		int shortestHeight = arr[0];
		for (int i=0;i<arr.length;i++) {
			if (arr[i] < shortestHeight) {
				shortestHeight = arr[i];
			}
		}
		return shortestHeight;
	}
	// Method to find the tallest height of the players
	public static int findTheTallest(int[] arr) {
		int tallest = arr[0];
		for (int i=0;i<arr.length;i++) {
			if (arr[i] > tallest) {
				tallest = arr[i];
			}
		}
		return tallest;
	}
 }
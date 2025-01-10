import java.util.Scanner;
public class CalMeanHeight {
    public static void main(String[] args) {
        //creating the instance of Scanner class
        Scanner input = new Scanner(System.in);
        // array to store heights
        double[] heights = new double[11];
        double sumResult = 0.0;
        // Take user input i.e. heights of the players
        System.out.println("Enter the heights in cm");
        for (int i = 0; i < 11; i++) {
            heights[i] = input.nextDouble();
            // Add  height to the final sum
            sumResult+= heights[i]; 
        }
        // Calculating the mean height
        double mean = sumResult / 11;
        // Print the mean height
        System.out.printf("\nThe mean height of the football team is: %.2f cm\n", mean);
        //stopping the Scanner stream
        input.close();
    }
}

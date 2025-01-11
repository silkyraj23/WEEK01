import java.util.Scanner;
public class FindYoungestAndTallest{
    public static void main(String[] args) {
        //creating the instance of scanner class
        Scanner input = new Scanner(System.in);
        // creating  arrays for storing age and height
        int[] age = new int[3];
        double[] height = new double[3];
        // Taking input for ages and heights from  user
        for (int i = 0; i < 3; i++) {
            age[i] = input.nextInt();
            height[i] = input.nextDouble();
        }
        // loop to find the youngest
        int youngestAge = age[0];
        int youngestIdx = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < youngestAge) {
                youngestAge = age[i];
                youngestIdx = i;
            }
        }
        // loop to find the tallest
        double tallestHeight = height[0];
        int tallestIdx = 0;
        for (int i = 1; i < 3; i++) {
            if (height[i] > tallestHeight) {
                tallestHeight = height[i];
                tallestIdx = i;
            }
        }
        // printthe youngest and tallest
        System.out.println("Youngest Friend: " + (youngestIdx == 0 ? "Amar" : (youngestIdx == 1 ? "Akbar" : "Anthony")) + " of age " + youngestAge);
        System.out.println("Tallest Friend: " + (tallestIdx == 0 ? "Amar" : (tallestIdx == 1 ? "Akbar" : "Anthony")) + " of height " + tallestHeight);
        input.close();
    }
}

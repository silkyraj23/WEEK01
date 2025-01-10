import java.util.Scanner;
public class FactsArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Check if the number is negative
        if (number <= 0) {
            System.out.println("Error: Please enter a valid number.");
        }else{
        // Initialize variables
        int maxFact = 10;
        int[] factors = new int[maxFact];
        int idx = 0;
        // Find factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // If the array is full, we will have to resize it
                if (idx == maxFact) {
                    maxFact *= 2; 
                    int[] temp = new int[maxFact];
                    System.arraycopy(factors, 0, temp, 0, factors.length); 
                    // Reassign the array
                    factors = temp;
                }
                factors[idx++] = i;
            }
        }
        // print the factors
        for (int i = 0; i < idx; i++) {
            System.out.print(factors[i] + " ");
        }
        }
        input.close();
    }
}

import java.util.Scanner;

public class ArrayInputSum{
       public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        // Initialize variables and array
        double[] numbers = new double[10];
        // To store the sum of all numbers
        double total = 0.0;
        //index to iterate 
        int idx = 0;

        System.out.println("Enter numbers (Enter 0 or a negative number to stop):");

        // loop for user input
        while (true) {
            System.out.print("Enter a number: ");
            double num = input.nextDouble();
            if (num <= 0) {
                break;
            }
            if (idx == 10) {
                System.out.println("Array is full");
                break;
            }

            // Store the value
            numbers[idx] = num;
            idx++;
        }

        // Calculate the sum of the elements in the array
        for (int i = 0; i < idx; i++) {
            total += numbers[i];
        }

        // print entered numbers and the total
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < idx; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("Sum of all numbers: " + total);

        input.close();
    }
}

import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Get input from user
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();
        // Checking if the number is a natural number
        if (number <= 0) {
            System.out.println( " Please enter a natural number "); 
        }else{
        // Define arrays for odd and even numbers
        int[] evenNum = new int[number / 2 + 1];
        int[] oddNum = new int[number / 2 + 1];
        int evenIdx = 0, oddIdx = 0;
        // Iterating using loop from 1 to the number
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNum[evenIdx++] = i; // Adding even numbers
            } else {
                oddNum[oddIdx++] = i; // Adding odd numbers
            }
        }
        // Printing the even numbers array
        System.out.print("Even Numbers: ");
        for (int i = 0; i < evenIdx; i++) {
            System.out.print(evenNum[i] + " ");
        }
        System.out.println();
        // Printing the odd numbers array
        System.out.print("Odd Numbers: ");
        for (int i = 0; i < oddIdx; i++) {
            System.out.print(oddNum[i] + " ");
        }
        }
        input.close();
    }
}

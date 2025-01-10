import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Take user input
        System.out.print("Enter a valid number: ");
        int number = input.nextInt();
        if (number <= 0) {
            System.out.println("Please enter a valid integer.");
        }
        else{
        // Creating a array to store results
        String[] arr = new String[number];
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                arr[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                arr[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                arr[i - 1] = "Buzz";
            } else {
                arr[i - 1] = String.valueOf(i);
            }
        }
        // Print the FizzBuzz result
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Position" + (i + 1) + " = " + arr[i]);
        }
        }
        input.close();
    }
}

import java.util.Scanner;
public class FindLargestAndSecondLargest{
    public static void main(String[] args) {
        //creating the instance of scanner class to take input from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Initialize the maximum number of digits to store in the array
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        // Loop to extract digits and store them in the array
        while (number != 0) {
            // Removing the last digit of the number
            digits[index] = number % 10;
            number = number / 10;
            index++;
            // If the array is full,resize the array
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                // Copy the element from the original array to the new array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                digits = temp;
            }
        }
        //creating a variable to store largest and second largest digit
        int largest = -1;
        int secondLargest = -1;
        // loop to Find largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        // print the result
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
        input.close();
    }
}

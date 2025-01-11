import java.util.Arrays;
import java.util.Scanner;
public class NumberChecker {
    // Method to find the countOfDigits
    public static int countOfDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    // Method to  storeTheDigits of number
    public static int[] storeTheDigits(int number) {
        int digits[] = new int[countOfDigits(number)];
        int index = digits.length-1;
        while (number != 0) {
            digits[index--] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to find the duckNumber number
    public static boolean duckNumber(int number) {
        int[] digits = storeTheDigits(number);
        for (int i=0;i< digits.length;i++) {
            if (digits[i] != 0) {
                return true;
            }
        }
        return false;
    }
    // Method to find the armstrongNumber number
    public static boolean armstrongNumber(int number) {
        int[] digits = storeTheDigits(number);
        int sum = 0;
        int power= digits.length;
        for (int i=0;i<digits.length;i++) {
            sum += Math.pow(digits[i], power);
        }
        return sum == number;
    }
    // Method to find the largest number
    public static int findLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
    // Method to find the second largest number
    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    // Method to find the smallest number
    public static int findSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
    // Method to find the second smallest number
    public static int findSecondSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = input.nextInt();
        // Printing the Results
        System.out.println("Number is: " + number);
        System.out.println("Number of Digits: " + countOfDigits(number));
        int[] digits = storeTheDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Is Duck Number? " + duckNumber(number));
        System.out.println("Is Armstrong Number? " +armstrongNumber(number));
        System.out.println("Largest Digit: " + findLargest(digits));
        System.out.println("Second Largest Digit: " +findSecondLargest(digits));
        System.out.println("Smallest Digit: " + findSmallest(digits));
        System.out.println("Second Smallest Digit: " +findSecondSmallest(digits));

        //scanner close
        input.close();
    }
}
import java.util.Scanner;
public class CalFreq {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Take input from user
        System.out.print("Enter a number: ");
        long number = input.nextLong();
        // Array to store individual digits of the number
        int[] digitsArr = new int[10]; 
        int[] freqArr = new int[10];  
        // find digits and store them in digits array
        long temp = number;
        while (temp > 0) {
            //find the last digit
            int digit = (int) (temp % 10);  
            digitsArr[digit]++;
            temp = temp / 10; 
        }
        // print the frequency of each digit
        System.out.println("\nFrequency of each digit in the number:");
        for (int i = 0; i < 10; i++) {
            if (digitsArr[i] > 0) {  
                System.out.println("Digit " + i + " is present " + digitsArr[i] + " times");
            }
        }
        input.close();
    }
}

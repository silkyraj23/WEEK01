import java.util.Scanner;
public class MulTableSixToNine{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Taking input from user 
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Define an array to store results
        int[] multiplicationTable = new int[4]; 
        // Calculate multiplication table for 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationTable[i - 6] = number * i;
        }
        // print the multiplication table
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationTable[i - 6]);
        }
        input.close();
    }
}

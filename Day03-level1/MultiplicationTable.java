import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        //creating the object of Scanner class to get user input
        Scanner input = new Scanner(System.in);

        // Get an integer input whoose table we want to find
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Define an array to store multiplication result
        int[] table = new int[10];

        // iterating the array to get required table
        for (int i = 0; i < table.length; i++) {
            table[i] = number * (i + 1);
        }

        // printing the multiplication table
        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }
        //closing the scanner stream
        input.close();
    }
}
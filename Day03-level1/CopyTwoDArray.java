import java.util.Scanner;
public class CopyTwoDArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Take input for rows and columns
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = input.nextInt();
        // Creating a 2D array
        int array[][] = new int[rows][cols];
        // Take user input for the 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                array[i][j] = input.nextInt();
            }
        }
        // Create a array to store elements
        int[] arr = new int[rows * cols];
        int idx = 0;
        // Copy elements from 2D array to arr
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[idx++] = array[i][j];
            }
        }
        // print the arr 
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        input.close();
    }
}

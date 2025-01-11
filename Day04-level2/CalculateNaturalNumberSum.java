import java.util.*;
public class CalculateNaturalNumberSum {
    public static int recursionSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursionSum(n - 1);
    }
    //  calculate sum using the formula 
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();
        // Check if the input is a natural number or not
        if (n <= 0) {
            System.out.println("Input is not a natural number.");
            return;
        }
        int recursiveSum =recursionSum(n);
        int formulaSum =formulaSum(n);
        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);
        if (recursiveSum == formulaSum) {
            System.out.println("Both computations are correct");
        }
        //closing the scanner stream
        input.close();

    }
}
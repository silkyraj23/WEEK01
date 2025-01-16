import java.util.Scanner;

public class GenerateFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of terms for Fibonacci sequence:");
        int terms = input.nextInt();
        generateFibonacci(terms);
        input.close();
    }
    //method to calculate fibonacci
    public static void generateFibonacci(int terms) {
        int a = 0, b = 1, next;
        System.out.println("Fibonacci sequence:");
        for (int i = 0; i < terms; i++) {
            System.out.print(a + " ");
            next = a + b;
            a = b;
            b = next;
        }
    }
}
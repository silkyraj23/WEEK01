import java.util.Scanner;
public class FindMaximum{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integers:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int max = findMax(a, b, c);
        System.out.println("The maximum number is: " + max);
        input.close();
    }

    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
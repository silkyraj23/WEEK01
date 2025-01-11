import java.util.Arrays;
import java.util.Scanner;
public class NumberCheckerFive {
    // Method to find factors of a number
    public static int[] findFactors(int number) {
        int fact = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                fact++;
            }
        }
        int[] factors = new int[fact];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }
    // Method to find the greatest factor of a number
    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }
    // Method to find the sum of the factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int i=0;i<factors.length;i++) {
            sum += factors[i];
        }
        return sum;
    }

    // Method to find the product of the factors
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int i=0;i<factors.length;i++) {
            product *= factors[i];
        }
        return product;
    }

    // Method to find the product of the cube of the factors
    public static int productOfCubes(int[] factors) {
        int product = 1;
        for (int i=0;i<factors.length;i++) {
            product *= Math.pow(factors[i], 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfect(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors);
        return sum - number == number;
    }
    // Method to check if a number is an abundant number
    public static boolean isAbundant(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors);
        return sum - number > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficient(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors);
        return sum - number < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrong(int number) {
        int temp = number;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    // Helper method to calculate factorial
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
	
        //create instance of scanner class
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        System.out.println("Number: " + number);
        int[] factors = findFactors(number);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " +productOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " +productOfCubes(factors));
        System.out.println("Is Perfect? " + isPerfect(number));
        System.out.println("Is Abundant? " + isAbundant(number));
        System.out.println("Is Deficient? " + isDeficient(number));
        System.out.println("Is Strong? " + isStrong(number));
		
        //close scanner
        input.close();
    }
}

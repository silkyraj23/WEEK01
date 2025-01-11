import java.util.Scanner;
public class CalculateFactor{
    public static int[] factor(int number){
        int index=0;
        int count=0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int arr[]=new int[count];
        for(int i=1;i<=number;i++){
            if(number%i==0){
                arr[index++]=i;
            }
        }
        return arr;
    }
    public static int calculateSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
    return sum;
    }
    public static int calculateProduct(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
    return product;
    }

    public static int calculateSumOfSquares(int[] factors) {
        int sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number= input.nextInt();
        int [] result = factor(number);
        System.out.print("Factors: ");
        for (int factor : result) {
            System.out.print(factor + " ");
        }
        System.out.println();
        int sum = calculateSum(result);
        int product = calculateProduct(result);
        int sumOfSquares = calculateSumOfSquares(result);
        System.out.println("Sum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumOfSquares);
        //closing the input stream
        input.close();
    }
}
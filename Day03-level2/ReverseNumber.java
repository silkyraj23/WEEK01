import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        //creating the instance of Scanner class
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Count the number of digits in the number
        int tempNum = number;
        int count = 0;
        while (tempNum != 0) {
            tempNum = tempNum / 10;
            count++;
        }
        // Create an array to store digits
        int[] digit = new int[count];
        tempNum = number;
        int idx = 0;
        while (tempNum != 0) {
            digit[idx] = tempNum % 10;
            tempNum = tempNum/ 10;
            idx++;
        }
        // print the reverse number
        for (int i = 0; i < count; i++) {
            System.out.print(digit[i]);
        }
        }
        //closing the Scanner stream
        input.close();
    }
}

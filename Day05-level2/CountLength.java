import java.util.Scanner;

public class CountLength {
    //Method to calculate length of string without using In-built method
    public static int calculateLength(String string) {
        int count = 0;
	//using try-catch block to handle exception
        try {
            while (true) {
                string.charAt(count);
                count++;
            }

        } catch (Exception e) {
            return count;
        }
    }
    public static void main(String[] args) {
        // creating the instance of scanner class
        Scanner input = new Scanner(System.in);
        // taking input from user
        System.out.println("Enter a string : ");
        String string = input.next();
        // In-built string methods to calculate length of string
        int length = string.length();
        // user-defined method to calculate length of string
        int length2 = calculateLength(string);
        System.out.println("The length of the string using In-built method is " + length);
        System.out.println("The length of the string using use-defined method is " + length);
        // closing the input stream
        input.close();
    }
}

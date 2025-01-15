import java.util.Scanner;
import java.lang.String;
public class IsPalindrome{
    //  Method to compare characters from start and end of the string
    public static boolean isPalindromeLogic1(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    // Recursive method to compare characters from start and end using recursion
    public static boolean isPalindromeLogic2(String text, int start, int end) {
        // Base case: if start index is greater than or equal to end index, return true
        if (start >= end) {
            return true;
        }
        // If characters at start and end do not match, return false
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        // Recursively check the next characters
        return isPalindromeLogic2(text, start + 1, end - 1);
    }

    // Method to compare the characters using a reversed string
    public static boolean isPalindromeLogic3(String text) {
        char[] originalArray = text.toCharArray();
        char[] reversedArray = reverseString(text);

        // Compare the original and reversed character arrays
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reversedArray[i]) {
                return false;
            }
        }

        return true;
    }

    // Helper method to reverse a string and return the character array
    public static char[] reverseString(String text) {
        char[] reversedArray = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            reversedArray[i] = text.charAt(text.length() - 1 - i);
        }
        return reversedArray;
    }

    // Main method
    public static void main(String[] args) {
        //creating the instance of scanner class to take input from user
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine();
        // Logic 1: Palindrome check using iterative method
        boolean result1 = isPalindromeLogic1(string);
        System.out.println("Using Logic 1 Iterative method : " + (result1 ? "Palindrome" : "Not a Palindrome"));
        // Logic 2: Palindrome check using recursion
        boolean result2 = isPalindromeLogic2(string, 0, string.length() - 1);
        System.out.println("Using Logic 2 Recursive: " + (result2 ? "Palindrome" : "Not a Palindrome"));
        // Logic 3: Palindrome check using reversed string
        boolean result3 = isPalindromeLogic3(string);
        System.out.println("Using Logic 3 Reversed String: " + (result3 ? "Palindrome" : "Not a Palindrome"));

        //closing the input stream
        input.close();
    }
}
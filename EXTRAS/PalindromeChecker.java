import java.util.Scanner;

public class PalindromeChecker {
    public static boolean checkPalindrome(String string) {
        int i = 0;
        Boolean palindrome = true;
        int j = string.length() - 1;
        while (i < j) {
            if (string.charAt(i) != string.charAt(j)) {
                palindrome = false;
                break;
            }
            i++;
            j--;
        }
        return palindrome;
    }

    public static void main(String[] args) {
        // creating the instance of scanner class
        Scanner input = new Scanner(System.in);
        // taking input from user
        System.out.println("Enter a string : ");
        String string = input.next();
        boolean palindrome = checkPalindrome(string);
        if (palindrome) {
            System.out.println("Yes, the given string is palindrome ");
        } else {
            System.out.println("No,the given string is not palindrome");
        }
        input.close();
    }
}

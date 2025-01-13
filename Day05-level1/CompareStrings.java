import java.util.Scanner;
import java.lang.String;

public class CompareStrings {
    public static void main(String[] args) {
        // instance of Scanner class to take input from user
        Scanner input = new Scanner(System.in);
        String first = input.next();
        String second = input.next();
        // this user defined method will compare string first and second
        boolean compareUsingCharAtMethod = compareString(first, second);
        // this built-in method will also compare both the string
        boolean compareUsingInBuiltMethod = first.equals(second);
        // if the output of user defined method and built in method is same return true
        // otherwise false
        if (compareUsingCharAtMethod == compareUsingInBuiltMethod) {
            System.out.println("Result are same");
        } else {
            System.out.println("Result are not same");
        }
    }

    public static boolean compareString(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
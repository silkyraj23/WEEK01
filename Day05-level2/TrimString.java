import java.util.Scanner;
public class TrimString{
    // Method to find the start and end indices to trim leading and trailing spaces
    public static int[] trimPoints(String str) {
        int start = 0;
        int end = str.length() - 1;
        // Trim leading spaces
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        // Trim trailing spaces
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }
    // Method to create a substring using charAt()
    public static String substring(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //creating the instance of Scanner class
        Scanner input = new Scanner(System.in);
        // Take input from user
        System.out.println("Enter a string with leading and trailing spaces:");
        String string = input.nextLine();
        int[] trimPoints = trimPoints(string);
        String trimmedCustom = substring(string, trimPoints[0], trimPoints[1]);
        // Use built-in trim method for comparison
        String trimmedBuiltIn = string.trim();
        // Compare 
        boolean areEqual = compareStrings(trimmedCustom, trimmedBuiltIn);
        // output
        System.out.println("Custom trimmed string: '" + trimmedCustom + "'");
        System.out.println("Built-in trimmed string: '" + trimmedBuiltIn + "'");
        System.out.println("Are the two strings equal? " + areEqual);
    }
}
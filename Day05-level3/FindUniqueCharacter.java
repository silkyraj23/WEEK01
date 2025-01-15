import java.util.Scanner;
import java.lang.String;
public class FindUniqueCharacter {
    // Method to calculate the length of a string without using length() method
    public static int calculateLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Reached the end of the string
        }
        return length;
    }

    // Method to find unique characters in a string using charAt()
    public static char[] findUniqueCharacters(String text) {
        int length = calculateLength(text);
        char[] tempUnique = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the current character is already in the unique list
            for (int j = 0; j < uniqueCount; j++) {
                if (tempUnique[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                tempUnique[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create an array to store only the unique characters
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = tempUnique[i];
        }

        return uniqueChars;
    }

    // Main method
    public static void main(String[] args) {
        //creating the instance of Scanner class
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine();
        // Find unique characters
        char[] uniqueChars = findUniqueCharacters(string);
        // Display the unique characters
        System.out.println("Unique Characters in the string:");
        for (int i=0;i<uniqueChars.length;i++) {
            System.out.print(uniqueChars[i] + " ");
        }
        //closing the input stream
        input.close();
    }
}
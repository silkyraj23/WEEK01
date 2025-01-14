import java.util.Scanner;
public class ShortestAndLargestString{
    // Method to find the length of the string without using the built-in length() method
    public static int findLength(String str) {
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        return length;
    }
    // Method to split the text into words using charAt() method
    public static String[] split(String text) {
        int length = findLength(text);
        int wordCount = 1;
        // Count the number of words by counting spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        String[] words = new String[wordCount];
        int wordStart = 0;
        int wordIndex = 0;

        for (int i = 0; i <= length; i++) {
            if (i == length || text.charAt(i) == ' ') {
                words[wordIndex++] = text.substring(wordStart, i);
                wordStart = i + 1;
            }
        }
        return words;
    }
    // Method to generate a 2D array containing words and their lengths
    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }
    // Method to find the shortest and longest strings
    public static int[] findShortestAndLongest(String[][] wordsWithLengths) {
        int shortest = Integer.MAX_VALUE;
        int longest = Integer.MIN_VALUE;

        for (String[] entry : wordsWithLengths) {
            int length = Integer.parseInt(entry[1]);
            if (length < shortest) {
                shortest = length;
            }
            if (length > longest) {
                longest = length;
            }
        }
        return new int[]{shortest, longest};
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take  input from user
        System.out.println("Enter a line of text: ");
        String string = input.nextLine();
        // Use the user-defined split method to get words
        String[] words = split(string);
        // Generate a 2D array with words and their lengths
        String[][] wordsWithLengths = wordsWithLengths(words);
        // Find the shortest and longest words
        int[] shortestAndLongest = findShortestAndLongest(wordsWithLengths);
        // Display the result
        System.out.println("Shortest word length: " + shortestAndLongest[0]);
        System.out.println("Longest word length: " + shortestAndLongest[1]);
        //closing the input stream
        input.close();
    }
}
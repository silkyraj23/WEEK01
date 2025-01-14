import java.util.Scanner;
public class CountVowelConsonant{
    public static String checkCharacter(char ch) {
        ch = Character.toLowerCase(ch);
        if ((ch >= 'a' && ch <= 'z')) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }
    // Method to find the no of vowels and consonants 
    public static int[] countVowelsAndConsonants(String text) {
        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < text.length(); i++) {
            String result = checkCharacter(text.charAt(i));
            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }
        return new int[]{vowelCount, consonantCount};
    }
    // Main method
    public static void main(String[] args) {
        //creating scanner class output
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a string:");
        String string = input.nextLine();

        int[] counts = countVowelsAndConsonants(string);
        System.out.println("Number of Vowels: " + counts[0]);
        System.out.println("Number of Consonants: " + counts[1]);
        //closing the input stream
        input.close();
    }
}

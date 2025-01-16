import java.util.Scanner;
public class CountVowelAndConsonants {
    // method to calculate count of vowel and consonant
    public static int[] countVowelAndConsonant(String string, int vowel, int consonant) {
        int arr[] = new int[26];
        for (int i = 0; i < string.length(); i++) {
            char curr = string.charAt(i);
            if (arr[curr - 'a'] == 0) {
                if (curr == 'a' || curr == 'e' || curr == 'i' || curr == 'o' || curr == 'u' || curr == 'A'
                        || curr == 'E' || curr == 'I' || curr == 'O' || curr == 'U') {
                    vowel++;
                } else {
                    consonant++;
                }
                arr[curr - 'a']++;
            }
        }
        return new int[] { vowel, consonant };

    }

    public static void main(String[] args) {
        // creating the instance of scanner class
        Scanner input = new Scanner(System.in);
        // taking input from user
        System.out.println("Enter a string : ");
        String string = input.next();
        int vowel = 0;
        int consonant = 0;
        // calling function countvowelAndConsonant to count vowel and consonant
        int count[] = countVowelAndConsonant(string, vowel, consonant);
        System.out.println("The count of Vowel is " + count[0] + " and the count of consonant is " + count[1]);
        input.close();
    }
}

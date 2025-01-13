import java.util.Scanner;
public class TextToUpperCase{
    public static String convertToUpperCaseUsingCharAt(String text) {
        String ans ="";
        for (int i = 0; i < text.length(); i++) {
            char curr = text.charAt(i);
            if (curr >= 'a' && curr <= 'z') {
                curr = (char) (curr- 32); // Convert lowercase to uppercase
            }
            ans+=curr;
        }
        return ans;
    }

    public static boolean compareStrings(String text1, String text2) {
        return text1.equals(text2);
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Enter a complete text: ");
        String userInput = input.nextLine();

        String upperCaseTextUsingCharAt = convertToUpperCaseUsingCharAt(userInput);
        String upperCaseTextUsingBuiltInMethod = userInput.toUpperCase();

        boolean areEqual = compareStrings(upperCaseTextUsingCharAt, upperCaseTextUsingBuiltInMethod);

        System.out.println("\nUppercase text using charAt(): " + upperCaseTextUsingCharAt);
        System.out.println("Uppercase text using toUpperCase(): " + upperCaseTextUsingBuiltInMethod);
        System.out.println("\nAre the two results the same? " + areEqual);
    }
}
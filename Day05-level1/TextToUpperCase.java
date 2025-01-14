import java.util.Scanner;
public class TextToUpperCase{
    //method to convert lower case character to upper case
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
    //method to compare two strings 
    public static boolean compareStrings(String text1, String text2) {
        return text1.equals(text2);
    }

    public static void main(String[] args) {
        //creating the instance of Scanner class
        Scanner input= new Scanner(System.in);
        //taking input from user
        System.out.print("Enter a complete text: ");
        String userInput = input.nextLine();

        String upperCaseTextUsingCharAt = convertToUpperCaseUsingCharAt(userInput);
        String upperCaseTextUsingBuiltInMethod = userInput.toUpperCase();

        boolean areEqual = compareStrings(upperCaseTextUsingCharAt, upperCaseTextUsingBuiltInMethod);
        //print the output
        System.out.println("\nUppercase text using charAt(): " + upperCaseTextUsingCharAt);
        System.out.println("Uppercase text using toUpperCase(): " + upperCaseTextUsingBuiltInMethod);
        System.out.println("\nAre the two results the same? " + areEqual);
    }
}
import java.util.Scanner;
public class DuplicateRemove {
    public static String removeDuplicate(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (result.indexOf(currentChar) == -1) {
                result += currentChar;

            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.next();
        String result = removeDuplicate(str);
        System.out.println("String after removing duplicate :" + result);
        //closing the input stream
        input.close();
    }
}
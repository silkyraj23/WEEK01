import java.util.Scanner;
import java.lang.String;
class CharacterInString {
    public static void main(String[] args) {
        // creating the instance of the scanner class
        Scanner input = new Scanner(System.in);
        String str = input.next();
        // calling the user defined function to get character of the string and then
        // store in array
        char arr[] = stringToCharArray(str);
        // calling the in built method to get character of the string and then store in
        // array
        char arr2[] = str.toCharArray();
        // if element of both array are equal return true otherwise false
        if (compare(arr, arr2)) {
            System.out.println("Both arrays are same");
        } else {
            System.out.println("Both arrays are not same");
        }

    }

    // method to convert character of string in to char array
    public static char[] stringToCharArray(String str) {
        char ans[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ans[i] = str.charAt(i);
        }
        return ans;
    }

    // method to compare arrays
    public static boolean compare(char arr[], char arr2[]) {
        if (arr.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}

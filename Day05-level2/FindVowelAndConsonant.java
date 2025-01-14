import java.util.Scanner;
import java.lang.String;

public class FindVowelAndConsonant {
	// method to check current char is vowel, consonant or not a letter
	public static void check(String string, String result[][]) {
		for (int i = 0; i < string.length(); i++) {
			char curr = string.charAt(i);

		}
		for (int i = 0; i < string.length(); i++) {
			char curr = string.charAt(i);
			if (curr >= 'A' && curr <= 'Z') {
				curr = (char) (curr + 32);
			}
			if (curr == 'a' || curr == 'e' || curr == 'i' || curr == 'o' || curr == 'u') {
				result[i][0] = String.valueOf(curr);
				result[i][1] = "vowel";
			} else if (curr >= 97 && curr <= 122) {
				result[i][0] = String.valueOf(curr);
				result[i][1] = "consonant";
			} else {
				result[i][0] = String.valueOf(curr);
				result[i][1] = "Not a letter";
			}
		}
	}
	//method to display array in tabular form
	public static void displayResultArray(String[][] resultArray) {
		System.out.println("+-----------+--------------+");
		System.out.println("| Character | Classification|");
		System.out.println("+-----------+--------------+");
		for (int i = 0; i < resultArray.length; i++) {
			System.out.printf("| %-9s | %-12s |\n", resultArray[i][0], resultArray[i][1]);
		}
		System.out.println("+-----------+--------------+");
	}
	public static void main(String args[]) {
		// creating the instance of scanner class
		Scanner input = new Scanner(System.in);
		// taking input of string
		System.out.println("Enter the string : ");
		String string = input.nextLine();
		//array to store character information
		String result[][] = new String[string.length()][2];
		check(string, result);
		displayResultArray(result);
		//closing the input stream
		input.close();
	}
}
	
	
	
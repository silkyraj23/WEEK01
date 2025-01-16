import java.util.Scanner;

public class TotalSubstring {
        // Method to find occurance of the substring
        public static int subStringCount(String str, String subString) {
                int count = 0;
                int length = str.length();
                int index = 0;
                for (int i = 0; i < str.length(); i++) {
                        if (str.indexOf(subString, index) == -1) {
                                break;
                        } else {
                                count++;
                                index = str.indexOf(subString, index) + subString.length();

                        }
                }

                return count;
        }

        public static void main(String[] args) {
                // creating the instance of scanner class
                Scanner input = new Scanner(System.in);
                System.out.print("Enter a string: ");
                String str = input.next();
                String subString = input.next();
                // method to calculate no. of tymes substring occurs
                int subStringCount = subStringCount(str, subString);
                // printing the output
                System.out.print("Substring occurs " + subStringCount + " times");
                // closing the input stream
                // input.close()

        }
}
import java.util.Scanner;
import java.lang.String;
public class ReverseString {
    // method to find reverse of the string
    public static String findReverse(String string) {
        StringBuilder sb = new StringBuilder(string);
        // loop to reverse a string
        int i = 0;
        int j = string.length()- 1;
        while (i < j) {
            char curri = sb.charAt(i);
            char currj = sb.charAt(j);
            sb.setCharAt(i, currj);
            sb.setCharAt(j, curri);
            i++;
            j--;
        }
        return sb.toString();

    }
    public static void main(String[] args){
        //creating the instance of scanner class
        Scanner input= new Scanner(System.in);
        //taking input from user
        System.out.println("Enter a string : ");
        String string=input.next();
        String ans=findReverse(string);
        System.out.println("The reverse of the string " + string + " is " + ans );
        input.close();
    }
}

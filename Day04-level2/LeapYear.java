import java.util.*;
public class LeapYear {
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Take the year from the user
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        // check if the year is >= 1582
        if (year < 1582) {
            System.out.println("The year must be greater than or equal to 1582.");
            return;
        }
        // Check if the year is a leap year or not
        if (isLeapYear(year)) {
            System.out.println("The year " + year + " is a Leap Year.");
        } else {
            System.out.println("The year " + year + " is not a Leap Year.");
        }
        //closing the scanner sstream
        input.close();
    }
}
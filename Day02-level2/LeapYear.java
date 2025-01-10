import java.util.Scanner;
public class LeapYear {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a year: ");
int year = input.nextInt();
if (year >= 1582) {
//conditional block to check whether the year is leap year or not
if (year % 400 == 0) {
System.out.println(year + " is a Leap Year");
} else if (year % 100 == 0) {
System.out.println(year + " is not a Leap Year");
} else if (year % 4 == 0) {
System.out.println(year + " is a Leap Year");
} else {
System.out.println(year + " is not a Leap Year");
}
} else {
System.out.println("Year must be lesser than or equal to 1582.");
}
input.close();
}
}
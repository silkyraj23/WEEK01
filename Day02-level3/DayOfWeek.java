import java.util.Scanner;
public class DayOfWeek {
public static void main(String[] args) {
//creating the object of scanner class
Scanner input = new Scanner(System.in);
System.out.print("Enter the month: ");
int month = input.nextInt();
System.out.print("Enter the day: ");
int day= input.nextInt();
System.out.print("Enter the year: ");
int year = input.nextInt();
// Calculate day using the formulas
int y0 = year - (14 - month) / 12;
int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
int m0 = month + 12 * ((14 - month) / 12) - 2;
// Calculating (day of the week)
int d0 = (day + x + 31 * m0 / 12) % 7;
System.out.println(d0);
}
}
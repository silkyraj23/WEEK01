import java.util.Scanner;
public class CheckIfHarshadNumber{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
//taking input from user
System.out.print("Enter a number: ");
int number = input.nextInt();
// Store the original number into another variable 
int orgNum = number;
//creating a var sum that will store the sum of digits of this num
int sum = 0;
//Loop to calculate the sum of digit
while (number > 0) {
int remainder = number % 10;     // last digit 
sum += remainder;                // Add the last digit to sum
number /= 10;                // Removing last digit
}
// Check if the original number is divisible by the sum
if (orgNum % sum == 0) {
System.out.println(orgNum + " is a Harshad Number.");
} 
else{
System.out.println(orgNum + " is not a Harshad Number.");
}
//closing the scanner stream
input.close();
}
}
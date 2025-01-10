import java.util.Scanner;
public class AbundantNumber {
public static void main(String[] args) {
// Create a scanner class's object  for input
Scanner input = new Scanner(System.in);
// Getting user input i.e. number
System.out.print("Enter a number: ");
int number = input.nextInt();
// Initialize the sum variable to 0
int sum = 0;
// Loop to iterates over all number
for (int i = 1; i < number; i++) {
// conditioal block to Check if the number is divisible by i
if (number % i == 0) {
sum += i;
}
}
// to Check if the number is abundant number or not
if (sum > number) {
System.out.println("Abundant Number");
} else {
System.out.println("Not an Abundant Number");
}
// Close the scanner
input.close();
}
}
import java.util.Scanner;

public class CountNumOfDigit {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
// taking input from the user
System.out.print("Enter a number: ");
int number = input.nextInt();
// Initialize the count variable to 0
int count = 0;
// Using  a loop to count the no of  digits
while(number != 0 ){
number /= 10;     
count++;        
}
System.out.println("The number of digits is: " + count);
input.close();
}
}
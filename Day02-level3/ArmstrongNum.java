import java.util.Scanner;
public class ArmstrongNum {
public static void main(String[] args) {
// Creating an object of Scanner class
Scanner input= new Scanner(System.in);
System.out.print("Enter a number : ");
int number = input.nextInt();
int sum = 0;
//Creating a copy of org number
int orgNum = number;
//while loop to find last digit of the number and then add
while (orgNum != 0) {
// Find the remainder  of the number that will be the last digit
int remainder = orgNum % 10;
// Add the cube of the remainder to sum
sum += Math.pow(remainder,3);
// Remove the last digit of origNum
orgNum /= 10;
}
// Check if sum and number are the same
if (sum == number) {
System.out.println(number + " is an Armstrong number.");
} else {
System.out.println(number + " is not an Armstrong number.");
}
input.close();
}
}

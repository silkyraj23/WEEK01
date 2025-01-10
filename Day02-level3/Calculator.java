import java.util.Scanner;
public class Calculator{
public static void main(String[] args) {
// Create a Scanner object to get user input
Scanner input = new Scanner(System.in);
// Create variables
double first, second;
String op;
// Get input values for first number, second number, and operator
System.out.print("Enter the first number: ");
first = input.nextDouble();
System.out.print("Enter the second number: ");
second = input.nextDouble();
System.out.print("Enter the operator : ");
op = input.next();
//Desigining calculator using switch case statement
switch (op) {
case "+":
//addition
System.out.println("Result= " + (first + second));
break;
case "-":
//subtraction
System.out.println("Result= " + (first - second));
break;
case "*":
// multiplication
System.out.println("Result= " + (first * second));
break;
case "/":
// division
System.out.println("Result= " + (first / second));
break;
default:
//invalid operator
System.out.println("Invalid Operator.");
break;
}
// Close the scanner
input.close();
}
}
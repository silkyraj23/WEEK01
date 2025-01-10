import java.util.Scanner;
public class IsPrime {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = input.nextInt();
boolean isPrime = true;
if (number <= 1) {
isPrime = false;
} else {
//if it is not divisible by any of the number between 2 and number(excluded), then it is prime number
for (int i = 2; i<number ; i++) {
if (number % i == 0) {
isPrime = false;
break;
}
}
}
//printing whether the number given is prime or not
if (isPrime) {
System.out.println(number + " is a Prime number.");
} else {
System.out.println(number + " is not a Prime number.");
}
input.close();
}
}
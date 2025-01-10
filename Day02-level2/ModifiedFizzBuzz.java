import java.util.Scanner;
public class ModifiedFizzBuzz {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a positive number: ");
int num = input.nextInt();
if (num > 0) {
int i = 1;
//loop to check whether the given num is divisible by 3,5 or both
while (i <= num) {
if (i % 3 == 0 && i % 5 == 0) {
System.out.println("FizzBuzz");
} else if (i % 3 == 0) {
System.out.println("Fizz");
} else if (i % 5 == 0) {
System.out.println("Buzz");
} else {
System.out.println(i);
}
i++;
}
} else {
System.out.println("Please enter a valid integer.");
}
//closing the scanner stream
input.close();
}
}
import java.util.Scanner;
public class FizzBuzz{
public static void main(String args[]){
//creating obj of scanner class to take input
Scanner input=new Scanner(System.in);
int number=input.nextInt();
if (number > 0) {
//loop to check number if it is divisible by 3,5or both
for (int i = 1; i <= number; i++) {
if (i % 3 == 0 && i % 5 == 0) {
System.out.println("FizzBuzz");
} 
else if (i % 3 == 0) {
System.out.println("Fizz");
} else if (i % 5 == 0) {
System.out.println("Buzz");
} else {
 System.out.println(i);
}
}
} else {
System.out.println("Please enter a valid number");
}
//closing the scanner stream
input.close();
}
}

  
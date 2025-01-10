import java.util.Scanner;
public class CheckIfSmallest{
public static void main(String args[]){
//creating the instance of the scanner class
Scanner input= new Scanner(System.in);
int number1=input.nextInt();
int number2=input.nextInt();
int number3=input.nextInt();
//we initialise the smallest var with num1
int smallest=number1;
//conditional statement to check first number is smallest or not
if(number2<smallest){
System.out.println("No, the first number is not smallest");
}
else if(number3<smallest){
System.out.println("No, the first number is not smallest");
}
else{
System.out.println("Yes, the first number is smallest");
}
//closing the scanner stream
input.close();
}
}
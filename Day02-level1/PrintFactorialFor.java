import java.util.Scanner;
public class PrintFactorialFor{
public static void main(String args[]){
//creating obj of scanner class to take inp
Scanner input=new Scanner(System.in);
int number=input.nextInt();
//variable factorial will store the final output
int factorial=1;
//loop to calculate factorial
for(int i=number;i>=1;i--){
factorial*=i;

}
System.out.println("Factorial of given number is "+ factorial);
//closing the scanner stream
input.close();
}
}
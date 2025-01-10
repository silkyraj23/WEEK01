import java.util.Scanner;
public class CheckIfDivisible{
public static void main(String args[]){
//creating a obj of scanner class
Scanner input=new Scanner(System.in);
int numToCheck=input.nextInt();
//conditional block to check whether the no. is divisible by 5 or not
if(numToCheck % 5==0){
System.out.println("Yes,  the given number is divisible by 5");
}else{
System.out.println("No, the given number is not divisible by 5");
}
//closing the scanner stream
input.close();
}
}
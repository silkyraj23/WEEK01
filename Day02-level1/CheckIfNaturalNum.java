import java.util.Scanner;
public class CheckIfNaturalNum{
public static void main(String args[]){
//creating obj of scanner class to take inp
Scanner input=new Scanner(System.in);
int number=input.nextInt();
//conditional statement to check if the given num is natural or not
if(number>=0){
//formula to find sum of n natural no
int sum=number*(number+1)/2;
System.out.println("The sum of "+number + " natural numbers is  " +sum);
//closing the scanner stream
}
else{
System.out.println("No, the given number is not a natural number");
}
input.close();
}
}
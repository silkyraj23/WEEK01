import java.util.Scanner;
public class CalculateBonus{
public static void main(String args[]){
//creating obj of scanner class to take inp
Scanner input=new Scanner(System.in);
int salary=input.nextInt();
int year=input.nextInt();
int bonus=0;
//conditional block to check if year is greater than 5 or not
if(year>5){
bonus=(salary*5)/100;
}
System.out.println("The bonus amount is equal to " + bonus);
//closing the scanner stream
input.close();
}
}
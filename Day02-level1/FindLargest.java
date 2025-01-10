import java.util.Scanner;
public class FindLargest{
public static void main(String args[]){
//creating obj of scanner class to take inp
Scanner input=new Scanner(System.in);
int number1=input.nextInt();
int number2=input.nextInt();
int number3=input.nextInt();
//storing the largest number in max variable
int max=Math.max(number1, Math.max(number2,number3));
//conditional statement to find which number is largest
if(number1==max){
System.out.println("number1 is the largest");
}else if(number2==max){
System.out.println("number2 is the largest");
}else{
System.out.println("number3 is the largest");
}
//closing the scanner stream
input.close();
}
}
import java.util.Scanner;
public class CheckNum{
public static void main(String args[]){
//creating obj of scanner class to take inp
Scanner input=new Scanner(System.in);
int number=input.nextInt();
//conditional statement to check whether the given num is positive, negative or zero
if(number>0){
System.out.println("Positive");
}
else if(number<0){
System.out.println("Negative");
}else{
System.out.println("Zero");
}
//closing the scanner stream
input.close();
}
}
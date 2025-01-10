import java.util.Scanner;
public class VoteOrNot{
public static void main(String args[]){
//creating obj of scanner class to take inp
Scanner input=new Scanner(System.in);
int age=input.nextInt();
//conditional block to check whether the person can vote or not
if(age>=18){
System.out.println("The person can vote");
}
else{
System.out.println("The person can't vote");
}
//closing the scanner stream
input.close();
}
}
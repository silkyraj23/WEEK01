import java.util.Scanner;
public class CountdownUsingWhile{
public static void main(String args[]){
//creating obj of scanner class to take inp
Scanner input=new Scanner(System.in);
int counter=input.nextInt();
//using while loop to countdown counter to 1
while(counter>1){
System.out.print(counter + " ");
counter--;
}
//closing the scanner stream
input.close();
}
}
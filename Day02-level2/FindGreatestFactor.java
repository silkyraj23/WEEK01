import java.util.Scanner;
public class FindGreatestFactor{
public static void main(String args[]){
//creating obj of scanner class to take input
Scanner input=new Scanner(System.in);
int number=input.nextInt();
//using loop to find greatest factor of a number
int result=0;
for(int i=1;i<number;i++){
if(number%i==0){
result= i;
}
}
System.out.println("The greatest factor of the given number excluding number itself is " + result);
//closing the scanner stream
input.close();
}
}
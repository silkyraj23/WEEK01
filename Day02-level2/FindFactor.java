import java.util.Scanner;
public class FindFactor{
public static void main(String args[]){
//creating obj of scanner class to take input
Scanner input=new Scanner(System.in);
int number=input.nextInt();
//using loop to find factor of a number
for(int i=1;i<=number;i++){
if(number%i==0){
System.out.print( i +" ");
}
}
//closing the scanner stream
input.close();
}
}
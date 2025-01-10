import java.util.Scanner;
public class MultiplicationTable{
public static void main(String args[]){
//creating obj of scanner class to take inp
Scanner input=new Scanner(System.in);
int num=input.nextInt();
//for loop to print table from 6 to 9
for(int i=6;i<=9;i++){
System.out.println(num+" * " + i +" = " + num*i);
}
//closing the scanner stream
input.close();
}
}
import java.util.Scanner;
public class SumUntilZero{
public static void main(String args[]){
//creating obj of scanner class to take inp
Scanner input=new Scanner(System.in);
double sum=0.0;
int num=input.nextInt();
//loop to find sum until user enters 0
while(num !=0){
sum+=num;
num=input.nextInt();
}
System.out.println(sum);
//closing the scanner stream
input.close();
}
}
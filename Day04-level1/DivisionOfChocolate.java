import java.util.Scanner;
public class DivisionOfChocolate{
public static void main(String args[]){
//creating the instance of scanner class
Scanner input= new Scanner(System.in);
//taking the input from user
System.out.println("Enter the number of chocolates ");
int noOfChocolates=input.nextInt();
System.out.println("Enter the number of children ");
int noOfRemainingChoco=input.nextInt();
//we will create method that Will return number of chocolate each student will get
//and the number of remaining chocolates
int ans[]= chocolateDistribution(noOfChocolates,noOfRemainingChoco);
System.out.println("The number of chocolate per student will get "+ans[0] +" and the remaining chocolate  "+ ans[1] );
input.close();
}
public static int[] chocolateDistribution(int noOfChocolate, int noOfRemaningChoco){
int ans[]=new int[2];
ans[0]=noOfChocolate/noOfRemaningChoco;
ans[1]=noOfChocolate%noOfRemaningChoco;
return ans;
}
}

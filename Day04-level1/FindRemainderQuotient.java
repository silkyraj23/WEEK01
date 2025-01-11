import java.util.Scanner;
public class FindRemainderQuotient{
public static void main(String args[]){
//creating the instance of scanner class
Scanner input= new Scanner(System.in);
//taking the input from user
System.out.println("Enter the number ");
int number=input.nextInt();
System.out.println("Enter the divisor ");
int divisor=input.nextInt();
//we will create method that Wii return remainder and quotient
int ans[]= findRemainderAndQuotient(number,divisor);
System.out.println("The remainder will be "+ans[0] +" and the quotient will be "+ ans[1] );
input.close();
}
public static int[] findRemainderAndQuotient(int number, int divisor){
int ans[]=new int[2];
ans[0]=number%divisor;
ans[1]=number/divisor;
return ans;
}
}







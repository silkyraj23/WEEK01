import java.util.*;
public class FindQuotientAndRem{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
int quotient= num1/num2;
int rem=num1%num2;
//modulous opertator is used to calculate remainder
System.out.println("The Quotient is " + quotient + " and remainder is "+ rem +" of two number "+ num1 +" and " + num2);
}
} 

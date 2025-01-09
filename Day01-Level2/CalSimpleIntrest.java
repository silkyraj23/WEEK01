import java.util.*;
public class CalSimpleIntrest{
public static void main(String args[]){
Scanner input= new Scanner(System.in);
//we are creating scanner class object to take input from user
int principal=input.nextInt();
int rateOfIntrest=input.nextInt();
int time=input.nextInt();
float simpleIntrest=(principal*rateOfIntrest*time)/100;
//formula to calculate SI
System.out.println("The Simple Interest is "+ simpleIntrest +" for principal "+ principal +", Rate of Intrest "+ rateOfIntrest+ " and Time "+ time);
input.close();
}
} 

import java.util.Scanner;
public class CalculateSI{
public static void main(String args[]){
//creating the instance of scanner class
Scanner input=new Scanner(System.in);
//taking principal , rate of intrest, time as input from user
System.out.println("Enter Prinipal : ");
int principal=input.nextInt();
System.out.println("Enter Rate Of Interest : ");
int rateOfInterest=input.nextInt();
System.out.println("Enter Time : ");
int time=input.nextInt();
//we will store the output return by the function in result variable
float result=calculateSI(principal,rateOfInterest,time);
System.out.println("The Simple Interest is "+result+"  for Principal "+ principal +", Rate of Interest "+rateOfInterest +" and Time "+ time);
input.close();
}
public static float calculateSI(int principal,int rateOfInterest,int time){
return (principal*rateOfInterest*time)/100;
}
}
import java.util.*;
public class SmallestLargest{
public static void main(String args[]){
//creating the instance of scanner class
Scanner input= new Scanner(System.in);
//taking the input from user
System.out.println("Enter the 1st number ");
int firstNum=input.nextInt();
System.out.println("Enter the 2nd number ");
int secondNum=input.nextInt();
System.out.println("Enter the 3rd number ");
int thirdNum=input.nextInt();
//we will create a method to find smallest and largest among the three number
int ans[]= findSmallestAndLargest(firstNum,secondNum,thirdNum);
System.out.print("The maximun number is "+ ans[0] +" and  miniumum is "+ans[1] + " among three numbers ");
input.close();
}
public static int[] findSmallestAndLargest(int firstNum, int secondNum,int thirdNum){
int ans[]=new int[2];
ans[0]=Math.max(firstNum,Math.max(secondNum,thirdNum));
ans[1]=Math.min(firstNum,Math.min(secondNum,thirdNum));
return ans;
}
}
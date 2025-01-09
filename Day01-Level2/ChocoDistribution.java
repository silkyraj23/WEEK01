import java.util.*;
public class ChocoDistribution{
public static void main(String args[]){
Scanner input= new Scanner(System.in);
//we are creating scanner class object to take input from user
int noOfChild=input.nextInt();
int noOfChoco=input.nextInt();
int noOfChocoPerChild=noOfChoco/noOfChild;
//here we are finding no of chocolaates each student will get
int remChoco=noOfChoco%noOfChild;
//here we are finding remaining chocolatesleft after distribution
System.out.println("The number of chocolates each child gets is "+ noOfChocoPerChild +" and the number of remaining chocolates are " +remChoco);
input.close();
}
}
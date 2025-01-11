import java.util.*;
public class MaxHandshake{
public static void main(String args[]){
//creating the object of scanner class
Scanner input=new Scanner(System.in);
int number=input.nextInt();
//we will create a method to find maximum handshake among 'N' student
//and store the result in ans variable
int ans=maxHandshake(number);
System.out.println("Maximum number of Handshake among N students = "+ ans);
input.close();
}
public static int maxHandshake(int number){
//we will use combination formula to calculate maximum no. of handshake
return (number * (number-1))/2;
}
}
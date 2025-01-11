import java.util.Scanner;
public class FindNoOfRound{
public static void main(String args[]){
//creating the object of scanner class
Scanner input= new Scanner(System.in);
//we will take input from user as triangle side
System.out.println("Enter First side : ");
int firstSide=input.nextInt();
System.out.println("Enter Second side : ");
int secondSide=input.nextInt();
System.out.println("Enter Third side : ");
int thirdSide=input.nextInt();
int distance=5;
//we will create a method to find no of rounds required to cover distance of 5 round
//and store the ans in round variable
int round=noOfRound(firstSide,secondSide,thirdSide,distance);
System.out.println("The number of rounds required to complete 5 km distance : "+ round);
input.close();
}
public static int noOfRound(int firstSide,int secondSide,int thirdSide,int distance){
//perimeter of the triangle = sum of all sides
int perimeter=firstSide+secondSide+thirdSide;
return  distance/perimeter;
}
}

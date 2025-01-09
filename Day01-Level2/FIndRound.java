import java.util.Scanner;
public class FindRound{
public static void main(String args[]){
Scanner input= new Scanner(System.in);
int distance=5;
int sideA=input.nextInt();
int sideB=input.nextInt();
int sideC=input.nextInt();
int perimeterOfTriangle=sideA+sideB+sideC;
//sum of all side is equal to perimeter of triangle
int noOfRounds=distance/perimeterOfTriangle;
//num of rounds will be calculated by this formula
System.out.println(" The total number of rounds the athlete will run is "+noOfRounds+ " to complete 5km");
input.close();
}
}
import java.util.*;
public class DistanceConversion{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int distanceInFeet=sc.nextInt();
int distanceInYard=distanceInFeet/3;
int distanceInMiles=distanceInYard/1760;
System.out.println("Distance in yard is "+distanceInYard + " and distance in miles is "+distanceInMiles);
}
}

import java.util.*;
public class TravelComputation{
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
// Create a variable name and take input from user
String name = input.nextLine();
// Create a variable fromCity, viaCity and toCity to indicate the city and take input from user
String fromCity = input.nextLine();
String viaCity = input.nextLine();
String toCity = input.nextLine();
// Create a variable distanceFromToVia to indicate the distance between the fromCity to viaCity
double distanceFromToVia = input.nextDouble();
// Create a variable timeFromToVia to indicate the time taken to travel from fromCity to viaCity in minutes
int timeFromToVia = input.nextInt();
// Create a variable distanceViaToFinalCity to indicate the distance between the viaCity to toCity
double distanceViaToFinalCity = input.nextDouble();
// Create a variable timeViaToFinalCity to indicate the time taken to travel from viaCity to toCity in minutes
int timeViaToFinalCity = input.nextInt();

// Create a variable totalDistance to indicate the total distance between the fromCity to toCity
double totalDistance = distanceFromToVia + distanceViaToFinalCity;
// Create a variable totalTime to indicate the total time taken to travel from fromCity to toCity in minutes
int totalTime = timeFromToVia + timeViaToFinalCity;
// Print the travel details
System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistance + " km and " +
                         "and the Total Time taken is " + totalTime + " minutes");
}
}



import java.util.*;
public class MaxHandshake{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int noOfStudents=sc.nextInt();
int maxHandshake=(noOfStudents*(noOfStudents-1))/2;
System.out.println("Maximum no of Handshake among N no of students is " + maxHandshake);
}
}
public class NoOfPens{
public static void main(String args[]){
int noOfPens=14;
int noOfStudents=3;
int noOfPenPerStudent=noOfPens/noOfStudents;
int remainingPen=noOfPens%noOfStudents;
System.out.println("The Pen Per Student is "+ noOfPenPerStudent +" and the remaining pen not distributed is " + remainingPen);
}
}
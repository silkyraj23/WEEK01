import java.util.*;
public class ConvertHeight{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int height=sc.nextInt();
double heightInInch=height/2.54;
double heightInFeet=heightInInch/12;
System.out.println("Your height in cm is "+ height +" while in feet is "+ heightInFeet+ " and inches is "+heightInInch);
}
}


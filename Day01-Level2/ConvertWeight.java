import java.util.*;
public class ConvertWeight{
public static void main(String args[]){
Scanner input=new Scanner(System.in);
//here we are creating object of scanner class to take input 
int weightInKg=input.nextInt();
double pound=weightInKg*2.2;
//as 1 pound=2.2kg
System.out.println("The weight of the person in pound is "+ pound +" and in kg is "+weightInKg);
input.close();
}
}


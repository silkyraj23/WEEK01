import java.util.*;
public class SpringSeason{
public static void main(String args[]){
//creating the instance of Scanner class
Scanner input=new Scanner(System.in);
int month=input.nextInt();
int day=input.nextInt();
//we will create a method to check whether the given month and day belongs to Spring season or not
//and store return values from function in a isSpring variable
boolean isSpring=checkIfSpringOrNot(month, day);
if(isSpring){
System.out.println("Its a spring Season");
}else{
System.out.println("Not a spring season");
}
input.close();
}
public static boolean checkIfSpringOrNot(int month, int date){
if(month==6){
return (date<=20 && date>=1);
}
else if(month==3){
return date>=20 && date<=30;
}
else if(date>=1 && date<=30 && month>=3 && month<=6){
return true;
}
return false;
}
}


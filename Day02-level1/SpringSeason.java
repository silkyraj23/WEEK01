import java.util.Scanner;
public class SpringSeason{
public static void main(String args[]){
//creating obj of scanner class to take inp
Scanner input=new Scanner(System.in);
//taking input from user (month,day)
int month=input.nextInt();
int day=input.nextInt();
//conditional statement to check whether the spring season is or not
if(month>=3 &&month<=6 && day<=20 && day>=1){
System.out.println("Its a spring season");
}
else{
System.out.println("It's not a spring season");
}
//closing the scanner stream
input.close();
}
}
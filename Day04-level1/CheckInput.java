import java.util.*;
public class CheckInput{
public static void main(String args[]){
//creating the instance of Scanner class
Scanner input=new Scanner(System.in);
int number=input.nextInt();
//we will create a function to verify whether the number is positive, negative or zero
//and store whatever function return in result variable
int result=verify(number);
if(result==-1){
System.out.println("The number is negative");
}else if(result==1){
System.out.println("The number is positive");
}else{
System.out.println("The number is zero");
}
input.close();
}
public static int verify(int number){
if(number<0){
return -1;
}else if(number==0){
return 0;
}else{
return 1;
}
}
}

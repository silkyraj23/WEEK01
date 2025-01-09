import java.util.*;
public class Calculator{
public static float add(float num1, float num2){
return num1+num2;
}
public static float substract(float num1, float num2){
return num1-num2;
}
public static float multiply(float num1, float num2){
return num1*num2;
}
public static float divide(float num1, float num2){
return num1/num2;
}
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
float num1= sc.nextFloat();
float num2= sc.nextFloat();
float resultAdd=add(num1,num2);
float resultSubstract=substract(num1,num2);
float resultMultiply=multiply(num1,num2);
float resultDivide=divide(num1,num2);
System.out.println("The addition,substraction,multiplication and division value of 2 numbers " +num1 +" and "+ num2 + " is " + resultAdd +", "+resultSubstract +", "+resultMultiply+", "
+resultDivide);

}
}
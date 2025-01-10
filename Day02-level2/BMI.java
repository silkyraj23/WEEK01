import java.util.Scanner;
public class BMI {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
//taking the input of user's height ,weight
double weight = input.nextDouble();
double heightCm = input.nextDouble();
double heightMeter = heightCm / 100;
double bmi = weight / (heightMeter * heightMeter);
System.out.println("BMI = " + bmi);
//conditional block to print according to bmi evaluated
if (bmi < 18.5) {
System.out.println("Underweight");
} else if (bmi >= 18.5 && bmi < 24.9) {
System.out.println("Normal weight");
} else if (bmi >= 25 && bmi < 29.9) {
System.out.println("Overweight");
} else {
System.out.println("Obesity");
}
input.close();
}
}
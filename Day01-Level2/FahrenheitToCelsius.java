import java.util.Scanner;
public class FahrenheitToCelsius{
public static void main(String args[]){
Scanner input= new Scanner(System.in);
//creating obj of scanner class to take input from user
int fahrenheit=input.nextInt();
float celsiusResult=(fahrenheit-32)*5/9;
//formula used to convert fahrenheit to celsius
System.out.println("The " + fahrenheit + " fahrenheit is "+ celsiusResult+" celsius" );
input.close();
}
}

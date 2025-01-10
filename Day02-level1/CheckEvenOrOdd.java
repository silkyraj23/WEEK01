import java.util.Scanner;
public class CheckEvenOrOdd{
public static void main(String args[]){
//creating obj of scanner class to take inp
Scanner input=new Scanner(System.in);
int num=input.nextInt();
//loop to print whether the number is odd or even
for(int i=1;i<=num;i++){
if(i%2==0){  //condition to check number is even?
System.out.println( i + " , even number");
}else{
System.out.println( i + " , odd number");
}
}
//closing the scanner stream
input.close();
}
}
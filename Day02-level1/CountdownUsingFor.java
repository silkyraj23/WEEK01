import java.util.Scanner;
public class CountdownUsingFor{
public static void main(String args[]){
//creating obj of scanner class to take inp
Scanner input=new Scanner(System.in);
int counter=input.nextInt();
//using for loop to countdown counter to 1
for(; counter>1;counter--){
System.out.print(counter + " ");
}
//closing the scanner stream
input.close();
}
}
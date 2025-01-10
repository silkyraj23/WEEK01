import java.util.Scanner;
public class SumNaturalNumWhile{
public static void main(String args[]){
//creating obj of scanner class to take inp
Scanner input=new Scanner(System.in);
int num=input.nextInt();
//condition to check num is natural num or not
if(num>=0){
// sumUsingFormula to store the sum of n natural num using formula
int sumUsingFormula=num *(num+1)/2;
//variable to store sum of n natural num using loop
int sumUsingLoop=0;
while(num>0){
sumUsingLoop+=num;
num--;
}
if(sumUsingLoop == sumUsingFormula){
System.out.println("both computations is correct");
}
}
//closing the scanner stream
input.close();
}
}
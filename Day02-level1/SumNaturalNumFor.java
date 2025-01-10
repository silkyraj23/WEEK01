import java.util.Scanner;
public class SumNaturalNumFor{
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
for(int i=num;i>=1;i--){
sumUsingLoop+=i;
}
if(sumUsingLoop == sumUsingFormula){
System.out.println("both computations is correct");
}
}
//closing the scanner stream
input.close();
}
}
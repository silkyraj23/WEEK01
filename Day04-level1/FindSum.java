import java.util.Scanner;
public class FindSum{
public static void main(String args[]){
//creating the object of scanner class
Scanner input=new Scanner(System.in);
int number=input.nextInt();
//create a function to find sum of n natural sum
//and store the sum in a variable ans
int ans=findSum(number);
System.out.println("The sum of the 'n' natural number is : " + ans);
input.close();
}
public static int findSum(int n){
int ans=0;
for(int i=1;i<=n;i++){
ans+=i;
}
return ans;
}
}


import java.util.Scanner;
public class CheckNumbers{
public static void main(String args[]){
//creating an instance of Scanner class
Scanner input= new Scanner(System.in);
//creating an array to store the age of 10 student
int arr[]=new int[5];
//loop to take number input from user
for(int i=0;i<arr.length;i++){
arr[i]=input.nextInt();
}
//loop to check positive ,negative or zero and perform next operation accordingly
for(int i=0;i<arr.length;i++){
if(arr[i]>0){
if(arr[i]%2==0){
System.out.println("The given number is even");
}else{
System.out.println("The given number is odd");
}
}
else if(arr[i]<0){
System.out.println("The given number is negative");
}
else{
System.out.println("The given number is Zero");
}
}
if(arr[0]>arr[arr.length-1]){
System.out.println("The First element is greater");
}
else if(arr[0]<arr[arr.length-1]){
System.out.println("The First element is smaller");
}else{
System.out.println("Both First and Last element are equal");
}
input.close();
}
}

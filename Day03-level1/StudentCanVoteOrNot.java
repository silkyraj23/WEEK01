import java.util.Scanner;
public class StudentCanVoteOrNot{
public static void main(String args[]){
//creating an instance of Scanner class
Scanner input= new Scanner(System.in);
//creating an array to store the age of 10 student
int arr[]=new int[10];
//loop to take age of student from user
for(int i=0;i<arr.length;i++){
arr[i]=input.nextInt();
}
//loop to print whether the student can vote or not
for(int i=0;i<arr.length;i++){
if(arr[i]<0){
System.out.println("Invalid age");
}
else if(arr[i]>=18){
System.out.println("The student with the age "+arr[i]+" can vote");
}else{
System.out.println("The student with the age " + arr[i] +" can't vote");
}
}
input.close();
}
}


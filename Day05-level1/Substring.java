import java.util.Scanner;
import java.lang.String;
public class Substring{
public static String findSubstring(String str,int start,int end){
String ans="";
for(int i=start;i<end;i++){
ans+=str.charAt(i);
}
return ans;
}


public static void main(String args[]){
//creating the instance of Scanner class
Scanner input= new Scanner(System.in);
String str=input.next();
int start=2;
int end=5; //this will be exclusive
//user defined method to find substring
String ans1=findSubstring(str,start,end);
//In-built method to find substring
String ans2=str.substring(start, end);
//compare output of both the methods
if(ans1==ans2){
System.out.println("Both substring are same");
}else{
System.out.println("Both substring are not same");
}
}
}

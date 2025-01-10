import java.util.Scanner;
public class CalculateGradeAndPercentage{
public static void main(String[] args) {
// creating variable to store the marks of subjects
float physics, chemistry, maths;
// Creating an object of Scanner class   
Scanner input = new Scanner(System.in);
//taking input from user 
physics = input.nextFloat();
chemistry = input.nextFloat();
maths = input.nextFloat();
float percentage = (physics + chemistry + maths)/3;
//evaluating the grade of the student
if(percentage >= 80){
System.out.println("Average marks "+ ((physics + chemistry + maths)/3) + "\nGrade is A \nRemark is Level-4, above agency-normalized standard");
}else if(percentage >= 70 && percentage <= 79){
System.out.println("Average marks "+ ((physics + chemistry + maths)/3) + "\nGrade is B \nRemark is Level-3, at agency-normalized standard");
}else if(percentage >= 60 && percentage <= 69){
System.out.println("Average marks "+ ((physics + chemistry + maths)/3) + "\nGrade is C \nRemark is Level-2, below, but approaching agency-normalized standard");
}else if(percentage >= 50 && percentage <= 59){
System.out.println("Average marks "+ ((physics + chemistry + maths)/3) + "\nGrade is D \nRemark is Level-1, well below agency-normalized standard");
}else if(percentage >= 40 && percentage <= 49){
System.out.println("Average marks "+ ((physics + chemistry + maths)/3) + "\nGrade is E \nRemark is Level-1-, too below agency-normalized standard");
}else{
System.out.println("Average marks "+ ((physics + chemistry + maths)/3) + "\nGrade is R \nRemark isRemedial Standards");
}
input.close();
}	
}
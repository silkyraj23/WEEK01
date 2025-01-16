import java.util.Scanner;
import java.lang.String;
public class CountVowelAndConsonants{
    public static void countVowelAndConsonant(String string , int vowel , int consonant){
        for(int i=0;i<string.length();i++){
            char curr=string.charAt(i);
            if(curr=='a' || curr=='e' || curr=='i' ||curr=='o'||curr=='u' || curr=='A' || curr=='E' || curr=='I' ||curr=='O'||curr=='U'){
            vowel++
            }
            else{
            consonant++
            }
        }
    }
    
public static void main(String[] args){
//creating the instance of scanner class
Scanner input= new Scanner(System.in);
//taking input from user
System.out.println("Enter a string : ");
String string=input.next();
int vowel=0;
int consonant=0;
//calling function to calculate vowel and consonant
countVowelAndConsonant(string,vowel,consonant);
System.out.println("The count of Vowel is " + vowel +" and the count of consonant is " + count );
//closing the input stream
input.close()
}
}

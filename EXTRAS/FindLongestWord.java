import java.util.Scanner;
public class FindLongestWord {
    // method to find longest word in the string
    public static String findLongestWord(String sentence){
        int current=0;
        int max=0;
        String str="";
        String ans="";
        for(int i=0;i<sentence.length();i++){
            char curr=sentence.charAt(i);
            if(curr==' '){
                if(max<current){
                    ans=str;
                    current=0;
                    str=""; 
                }else{
                ans+=curr;
                current++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // creating the instance of scanner class
        Scanner input = new Scanner(System.in);
        // taking input from user
        System.out.println("Enter a string : ");
        String sentence = input.nextLine();
        String ans = findLongestWord(sentence);
        System.out.println("The longest word in the sentence is " + ans);
        input.close();
    }
}

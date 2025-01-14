import java.util.Scanner;
public class StringIndexOutOfBoundException{
    //we will try to access the invalid index of string
    public static char stringIndexOutOfBound(String str)
    {
        return str.charAt(str.length());
    }
    public static void main(String args[])
    {   
        //create the instance of scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = input.next();
        try{
            char stringIndexOutOfBound = stringIndexOutOfBound(str);
        }
        //catch block get executed after exceotion occur
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println(e + " is found");
        }
        //closing the input stream
        input.close();
    }
}

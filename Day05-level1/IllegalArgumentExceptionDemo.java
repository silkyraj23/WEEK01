import java.util.Scanner;
public class IllegalArgumentExceptionDemo{
/*method with help of which we will demonstrate IllegalArgument exception */

    public static String  stringIllegalArgument(String str, int start,int end)
    {
        String subString = str.substring(start,end);
        return subString;
    }
    public static void main(String args[])
    {
        //creating the insatnce of Scanner class
        Scanner input = new Scanner(System.in);
        String str = input.next();
        try{
            String str2 = stringIllegalArgument(str, str.length(), 15);
        }
        //after exception will occur catch block will get executed
        catch(Exception e)
        {
            System.out.println("IllegalArgument Exception ");
        }
        //closing the input stream
        input.close();
    }

}
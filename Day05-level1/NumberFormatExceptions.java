import java.util.Scanner;
public class NumberFormatExceptions{
    //method to demonstrate number format exception
    public static int numberFormatException(String str)
    {
        //this line may cause an exception
        int number = Integer.parseInt(str);
        return number;
    }
    public static void main(String args[])
    {
        //creating the instance of scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = input.next();
        try
        {
            int number = numberFormatException(str);
        }
        //catch block will get executed after exception occurs
        catch(NumberFormatException e){
            System.out.println("It shows number format exception");
        }
        //closing the input sream
        input.close();
    }
}

import java.util.Scanner;
public class {
    //In this method we will try to access invalid index
    public static int arrayIndexOutOfBoundsException(int arr[]) {

        return arr[-1];
    }
    public static void nullPointerExceptionHandler(int arr[]){
        try{
            int number = arrayIndexOutOfBoundsException(arr);
            
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBound Exception");
        }

    }
    public static void main(String[] args) {
        //creating the object of Scanner class
        Scanner input = new Scanner(System.in);
        //creating an array of  size 5
        int arr[] = new int[5];
        System.out.println("Enter the number of Array");
        for(int i = 0;i<5;i++)
        {
            arr[i] = input.nextInt();
        }
        try{
            int number = arrayIndexOutOfBoundsException(arr);
            
        }
        //This block will get executed after exception will occur
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBound Exception");
        }
    }
}

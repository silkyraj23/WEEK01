public class NullPointerExceptions {
    //method where null pointer exception will occur
    public static char nullPointerException(String string){
        return string.charAt(0);
    }
    public static void main(String args[])
    { 
        //we will initialize string with null
        String text = null;
        try
        {
            //we will try to access which doesn't exsost
            //exception will occur
            char nullPointerException = nullPointerException(text);
        }
        //this block will execute after exception will occur
        catch(NullPointerException e)
        {
            System.out.println("NullPointerException");
        }
    }
}
public class NullPointerExceptions {
    public static char nullPointerException(String string){
        return string.charAt(0);
    }
    public static void main(String args[])
    {
        String text = null;
        try
        {
            char nullPointerException = nullPointerException(text);
        }
        catch(NullPointerException e)
        {
            System.out.println("NullPointerException");
        }
    }
}
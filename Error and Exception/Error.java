package error;

/**
 *
 * @author Moloy
 */
public class Error {
    public static void main(String[] args) {
        int x;
        int[] a=new int[2];
        a[0]=4;
        a[1]=5;
        int y;
        
        try
        {
           x=4/0; 
        }
        catch (ArithmeticException e) //We know the type of Exception
        {
            System.out.println("For 1st block:");
            System.out.println(e);
            System.out.println();
        }
        
        try
        {
           x=4/0; 
        }
        catch (Exception e) //When we don't knnow the Exception type:
        {
            System.out.println("For 2nd block:");
            System.out.println(e);
            System.out.println();
        }
        
        try
        {
           y=a[3];
        }
        catch (Exception e)
        {
            System.out.println("For 3rd block:");
            System.out.println(e);
            System.out.println();
        }
        
        try
        {
           y=a[3];
        }
        catch (ArrayIndexOutOfBoundsException e) //We know the type
        {
            System.out.println("For 4th block:");
            System.out.println(e);
            System.out.println();
        }
    }
    
}


/*
Output:

For 1st block:
java.lang.ArithmeticException: / by zero

For 2nd block:
java.lang.ArithmeticException: / by zero

For 3rd block:
java.lang.ArrayIndexOutOfBoundsException: 3

For 4th block:
java.lang.ArrayIndexOutOfBoundsException: 3
*/

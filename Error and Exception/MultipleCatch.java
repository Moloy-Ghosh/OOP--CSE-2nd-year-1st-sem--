package multiplecatch;

/**
 *
 * @author Moloy
 * 
 * When an exception in a try block is generated, the java treats the multiple catch
 * statements like cases in a switch statement. The first statement whose parameter
 * matches with the exception object will be executed and the remaining statements
 * will be skipped.
 */
public class MultipleCatch {
    public static void main(String[] args) {
        int a[]={5,10};
        try{
            int x=a[2]/a[1];
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(ex);
        }
        catch(ArrayStoreException e){
            System.out.println("Wrong data type");
        }
        int y=a[1]/a[0];
        System.out.println("y="+y);
    }
    
}

/*
Output:

java.lang.ArrayIndexOutOfBoundsException: 2
y=2
*/

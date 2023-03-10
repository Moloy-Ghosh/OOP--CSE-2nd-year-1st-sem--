package multiplecatch;

/**
 *
 * @author Moloy
 */
public class MultipleCatch {
    public static void main(String[] args) {
        int a[]={5,10};
        try{
            int x=a[2]/a[1];
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(ex);
        }
        catch(ArrayStoreException e){
            System.out.println("Wrong data type");
        }
        finally{
            int y=a[1]/a[0];
            System.out.println("y="+y);
        }
    }
    
}

/*
Output:

java.lang.ArrayIndexOutOfBoundsException: 2
y=2
*/

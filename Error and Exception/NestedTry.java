package nested.pkgtry;

/**
 *
 * @author Moloy
 */
public class NestedTry {
    public static void main(String[] args) {
        try{
           int z;
           int p[]={2};
           p[3]=33;
           try{
               z=4/0;
               System.out.println("The value of z is ="+z);
           }
           catch(Exception e){
               System.out.println("Division by zero");
           }
        }
        catch(Exception e){
            System.out.println("Array index is out-of-bounds");
        }
    }
    
}

/*
Output:

Array index is out-of-bounds
*/

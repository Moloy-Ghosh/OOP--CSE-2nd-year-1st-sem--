package myownexception;

/**
 *
 * @author WALTON
 */
public class MyOwnException {
    public static void main(String[] args) {
        int x=3;
        try{
            int result=x-4;
            if(x<4){
                throw new MyException("Value is less than 4"); //MyException Class needed!
            }
        }
        catch(MyException e){
            System.out.println(e);
        }
    }
    
}

/*
Output:
myownexception.MyException: Value is less than 4
*/
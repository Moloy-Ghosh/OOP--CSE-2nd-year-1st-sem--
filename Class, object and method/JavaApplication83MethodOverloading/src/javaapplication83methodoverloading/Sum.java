package javaapplication83methodoverloading;

/**
 *
 * @author Moloy
 */
public class Sum {
    void displaySum(int a,int b)
    {
        System.out.println(a+b);
    }
    void displaySum(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
    
    //in method overloading return type can also be different!
    /* it will make error
    int displaySum(int a,int b)
    {
        return (a+b);
    }
    
    But it not.
    int displaySum(int a,int b,int c,int d)
    {
        return (a+b+c+d);
    }*/
}

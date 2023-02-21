package javaapplication84nestingofmethods;

/**
 *
 * @author Moloy
 */
public class TwoNum {
    int m,n;
    void value(int a,int b)
    {
        m=a;
        n=b;
    }
    int largest()
    {
        if(m>=n) return m;
        else return n;
    }
    void display()
    {
        int large = largest(); //calling a method in another method (nesting)
        System.out.println("Largest value= "+large);
    }
}

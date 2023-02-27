package javaapplication88abstraction;

/**
 *
 * @author Moloy
 */
public class JavaApplication88Abstraction {
    public static void main(String[] args) {
        //MobileUser mu1=new MobileUser(); it's abstract, so cannot be instantiated
        Rahim mu1=new Rahim();
        Karim mu2=new Karim();
        mu2.call();
        mu2.Mms();
    }
    
}


package javaapplication82classobjectmethod;

/**
 *
 * @author Moloy
 */
public class JavaApplication82ClassObjectMethod {
    public static void main(String[] args) {
        Rectangle rec1; //declare the object
        rec1=new Rectangle(); //instantiate the object
        rec1.length=15; //Accessing Variables
        rec1.width=10;
        System.out.println(rec1.recArea()); //calling a method in println
        
        Rectangle rec2=new Rectangle();
        rec2.getData(20,15);
        int area2=rec2.recArea();
        System.out.println(area2);
    }
    
}

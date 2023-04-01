package javaapplication103;

/**
 *
 * @author Moloy
 */
public class JavaApplication103 {
    public static void main(String[] args) {
        //One kind
        A obj1=new A();
        obj1.start();  //for class A 
        B obj2=new B();
        obj2.start();  //for calss B
        
        //another kind
        new A().start(); //for class A
        new B().start(); //for class B
    }
    
}

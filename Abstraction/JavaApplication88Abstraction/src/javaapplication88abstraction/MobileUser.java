package javaapplication88abstraction;

/**
 *
 * @author Moloy
 */
public abstract class MobileUser {
    void call(){ //non abstract method
        System.out.println("Call method");
    }
    
    abstract void sendMessage();
    
    final void Mms(){ //Abstract class can have final method.
        System.out.println("MMS method which is final");
    }
}

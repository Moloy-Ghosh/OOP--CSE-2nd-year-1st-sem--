package javaapplication103;

/**
 *
 * @author Moloy
 */
public class A extends Thread { //Declare the class as extending the Thread class
    public void run(){
        for(int i=1;i<=1500;i++){
            System.out.println("From class A: "+i);
        }
    }
}

package javaapplication103;

/**
 *
 * @author Moloy
 */
public class B extends Thread{
    public void run(){
        for(int i=1;i<=1500;i++){
            System.out.println("From class B: "+i);
        }
    }
}

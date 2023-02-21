package javaapplication85constructoroverloading;

/**
 *
 * @author Moloy
 */
public class JavaApplication85ConstructorOverloading {
    public static void main(String[] args) {
        Room room1=new Room(25, (float) 15.7);
        Room room2=new Room(10);
        System.out.println(room1.area());
        System.out.println(room2.area());
    }
    
}

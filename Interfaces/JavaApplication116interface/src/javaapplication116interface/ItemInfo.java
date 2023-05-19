package javaapplication116interface;

/**
 *
 * @author Moloy
 */
public class ItemInfo implements Item {

    @Override
    public void display() {
        System.out.println("Code: "+code);
        System.out.println("Name: "+name);
    }
    
}

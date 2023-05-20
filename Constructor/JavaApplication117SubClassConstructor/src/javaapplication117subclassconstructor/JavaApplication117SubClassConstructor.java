package javaapplication117subclassconstructor;

/**
 *
 * @author Moloy
 */
public class JavaApplication117SubClassConstructor {
    public static void main(String[] args) {
        BedRoom bdr1=new BedRoom(12,34,33);
        System.out.println(bdr1.area());
        Room rm1=new Room(12,33);
        System.out.println(rm1.area());
    }
    
}

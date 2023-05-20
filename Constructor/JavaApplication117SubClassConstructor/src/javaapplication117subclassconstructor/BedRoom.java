package javaapplication117subclassconstructor;

/**
 *
 * @author Moloy
 */
public class BedRoom extends Room {
    float height;
    
    public BedRoom(float x, float y, float z) {
        super(x, y);
        height=z;
    }
    
    float area(){
        return(height*breadth*length);
    }
    
}

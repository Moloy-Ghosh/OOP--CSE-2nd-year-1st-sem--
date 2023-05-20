package javaapplication117subclassconstructor;

/**
 *
 * @author Moloy
 */
public class Room {
    float length;
    float breadth;
    Room(float x,float y){
        length=x;
        breadth=y;
    }
    float area(){
        return (length*breadth);
    }
}

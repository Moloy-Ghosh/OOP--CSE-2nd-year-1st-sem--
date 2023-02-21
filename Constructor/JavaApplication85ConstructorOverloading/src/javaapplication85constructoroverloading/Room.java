package javaapplication85constructoroverloading;

/**
 *
 * @author Moloy
 */
public class Room {
    float length;
    float breadth;
    Room (float x,float y)
    {
        length=x;
        breadth=y;
    }
    Room (float x)
    {
        length=breadth=x;
    }
    float area()
    {
        return (length*breadth);
    }
}

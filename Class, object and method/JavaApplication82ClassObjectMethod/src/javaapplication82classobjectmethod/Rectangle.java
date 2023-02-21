package javaapplication82classobjectmethod;

/**
 *
 * @author Moloy
 */
public class Rectangle {
    int length,width; //Combined deeclaration.
    void getData(int x,int y) //method declaration with two paarameters
    {
        length=x;
        width=y;
    }
    int recArea()//Declaration of another method
    {
        int area=length*width;
        return area;
    }
}

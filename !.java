package javaapp;

/**
 *
 * @author Moloy
 */
public class Javaapp {
    public static void main(String[] args) {
        double r;
        r=24/23; //ans: 1
        r=(double) 24/23; //ans: 1.0434782608695652
        r=(double)(24/23)*4; //ans: 4
        r=(double)(24/23)*(double)4; //ans: 4
        r=((double)24/23)*(double)4; ////ans: 4.173913043478261
    }
    
}

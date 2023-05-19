package javaapplication115interfaces;

/**
 *
 * @author Moloy
 */
public class me implements Name, other {

    @Override
    public void display1(String n1, String n2, String n3) {
        System.out.println("Name :"+ n1);
        System.out.println("Father Name :"+ n2);
        System.out.println("Mother Name :"+ n3);
    }

    @Override
    public void display2(int a, int b, int c) {
        System.out.println("UniName :"+ uniName);
        System.out.println("ID :"+ a);
        System.out.println("Age :"+ b);
        System.out.println("Fee :"+ c);
    }
    
}

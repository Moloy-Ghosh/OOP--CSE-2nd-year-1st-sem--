package javaapplication87super;

/**
 *
 * @author Moloy
 */
public class Person {
    String name;
    int age;
    Person(String nam, int ag)
    {
        name=nam;
        age=ag;
    }
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

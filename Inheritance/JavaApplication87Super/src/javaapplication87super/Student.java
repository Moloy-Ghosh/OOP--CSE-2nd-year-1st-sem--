package javaapplication87super;

/**
 *
 * @author Moloy
 */
final public class Student extends Person{
    String batch;

    public Student(String nam, int ag, String btc) {
        super(nam, ag);
        batch=btc;
    }
    
    @Override
    void display()
    {
        super.display();
        System.out.println("Batch: "+batch);
    }
}

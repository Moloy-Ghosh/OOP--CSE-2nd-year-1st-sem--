package javaapplication102;
import java.util.Vector;

/**
 *
 * @author Moloy
 */
public class JavaApplication102 {
    public static void main(String[] args) {
        Vector list1=new Vector(); //declaring without size
        list1.addElement("Moloy");
        list1.addElement("Rhaul");
        list1.addElement("Karim");
        list1.addElement("Rahim");
        list1.addElement("Abul");

        System.out.println(list1);
        //Output: [Moloy, Rhaul, Karim, Rahim, Abul]
        
        System.out.println(list1.elementAt(0));
        //Output: Moloy
        
        System.out.println(list1.size());
        //Output: 5
        
        list1.insertElementAt("Rony",2);
        System.out.println(list1);
        //Output: [Moloy, Rhaul, Rony, Karim, Rahim, Abul]
        
        list1.removeElement("Abul");
        System.out.println(list1);
        //Output: [Moloy, Rhaul, Rony, Karim, Rahim]
        
        list1.removeElementAt(1);
        System.out.println(list1);
        //Output: [Moloy, Rony, Karim, Rahim]
        
        String name[]=new String[4];
        list1.copyInto(name);
        System.out.println(name[0]);
        //Output: Moloy
        
        System.out.println(list1);
        //Output: [Moloy, Rony, Karim, Rahim]
        list1.removeAllElements();
        System.out.println(list1);
        //Output: []
        
        Vector list2=new Vector(3); //declaring with size
        System.out.println(list2.size());
        //Output: 0
        list2.addElement("Moloy");
        list2.addElement("Kibria");
        list2.addElement("Jhonson");
        list2.addElement("Alauddin");
        
        System.out.println(list2);
        //Output: [Moloy, Kibria, Jhonson, Alauddin]
        //Though size is given but it takes also 4th value
        
        System.out.println(list2.size());
        //Output: 4
    }
    
}

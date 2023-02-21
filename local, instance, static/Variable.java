package javaapplication80;
public class Variable {
    static String UniName="North Western University";
    String name;
    int age;
    
    Variable(String nam,int ag){
        name=nam;
        age=ag;
    }
    
    //UniName is a static variable.
    //name,age are instance variable.
    //nam,ag are locl variabble.
    
    void display(){
        System.out.println("University Name: "+UniName);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

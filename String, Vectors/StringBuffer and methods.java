package javaapplication101;

/**
 *
 * @author Moloy
 */
public class JavaApplication101 {
    public static void main(String[] args) {
        String s1="Moloy"; //string class
        String s2="Ghosh";
        //s1.append(s2); //error
        
        StringBuffer str1=new StringBuffer("Moloy");
        System.out.println(str1); //Output: Moloy
        StringBuffer str2=new StringBuffer("Ghosh");
        StringBuffer str3=new StringBuffer();
        //str3="Ghosh"; //error
        
        str1.setCharAt(1,'*');
        System.out.println(str1); //Output: M*loy
        
        str1.append(str2);
        System.out.println(str1); //Output: M*loyGhosh
        
        str1.insert(5, " ");
        System.out.println(str1); //Output: M*loy Ghosh
        
        str1.setLength(5);
        System.out.println(str1); //Output: M*loy
        
        str1.reverse();
        System.out.println(str1); //Output: yol*M
        
        String s=str1.reverse().toString(); //Convert to string class
        System.out.println(s);  //Output: M*loy
        
        boolean b=s.isEmpty();
        System.out.println(b); //Output: false
        
        //boolean b=str1.isEmpty(); //Error, Not for StringBuffer
        
    }
    
}

package javaapplication100;

/**
 *
 * @author Moloy
 */
public class JavaApplication100 {
    public static void main(String[] args) {
        String s1="Moloy";
        String s2="     Kumar Ghosh";
        String s3="moloy";
        String s4=new String ("Moloy");
        String s="Moloy";
        
        String s5=s1.toLowerCase();
        System.out.println(s5);   // Output: moloy
        
        s5=s1.toUpperCase();
        System.out.println(s5);   // Output: MOLOY
        
        s5=s1.replace('o', 'x');
        System.out.println(s5);    //Output: Mxlxy
        
        s5=s2.trim(); //Remove white spaces at the beginning and end of the string s2
        System.out.println(s5+"\n"+s2);
        /*
        Output:  Kumar Ghosh
                      Kumar Ghosh
        */
        
        boolean b=s1.equals(s4);
        System.out.println(b);  //Output: true
        
        if(s1==s4) System.out.println("true");
        else System.out.println("false");
        //Output: false
        
        if(s1==s) System.out.println("true");
        else System.out.println("false");
        //Output: true
        
        b=s1.equalsIgnoreCase(s3);
        System.out.println(b);  //Output: true
        
        System.out.println(s1.length()); //Output: 5
        
        System.out.println(s1.charAt(4)); //Output: y
        
        System.out.println(s1.compareTo(s2));  //Output: 45  //M>K
        System.out.println(s2.compareTo(s1));  //Output: -45
        System.out.println(s1.compareTo(s4));  //Output: 0
        
        System.out.println(s1.concat(s2));  //Output: Moloy     Kumar Ghosh
        
        System.out.println(s1.substring(3));  //Output: oy //from 3rd index
        
        System.out.println(s1.substring(2, 4)); //Output: lo //from 2nd to 3rd index
        
        int p=1234;
        System.out.println(String.valueOf(s)); //Output: Moloy
        System.out.println(String.valueOf(p)); //Outpur: 1234
        
        //
        
        System.out.println(s1.indexOf('o'));  //Output: 1
        
        System.out.println(s1.indexOf('o',2)); //Output: 3 //index of 2nd o
        
        //System.out.println(s1[0]); //error
        //if(s1[1]==s[s3]) System.out.println("True"); //error
        
    }
    
}

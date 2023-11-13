import java.util.*;
public class Vector_demo {
    public static void main(String [] args){

        Vector v=new Vector();
        System.out.println(v.capacity());

        v.add(10);
        v.addElement(20);
        v.addElement(30);
        v.addElement(40);
        System.out.println(v);
    
        Enumeration e=v.elements();
        System.out.println("Vector Elements are: ");
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}

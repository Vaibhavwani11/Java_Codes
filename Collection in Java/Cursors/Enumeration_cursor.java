import java.util.*;
public class Enumeration_cursor {
    public static void main(String[] args) {

        // Enumeration cursor is applicable on Legacy classes only. i.e.Vector and Stack
        Vector v = new Vector();

        v.addElement(10);
        v.addElement(20);
        v.addElement(30);
        v.addElement(40);

        System.out.println(v);

        Enumeration e = v.elements(); // elements is method of Vector class
        // Here we pass our Vector to object of Enumeration cursor.

        while(e.hasMoreElements()) {

            Integer val=(Integer)e.nextElement();
            if(val%4==0)
                v.remove(val);
        }
        e=v.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement()); // By this, now we can access elements one by one.
        }
    }
}

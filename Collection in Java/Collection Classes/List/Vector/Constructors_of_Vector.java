import java.util.Vector;
import java.util.LinkedList;
public class Constructors_of_Vector {
    public static void main(String[] args) {

        // 1)default capacity=10
        Vector v = new Vector();
        System.out.println(v.capacity());
        // 2)Vector v2=new Vector(int initialCapacity);
        Vector v2 = new Vector(30);
        System.out.println(v2.capacity());
        // 3)Vector v3=new Vector<>(int initialCapacity, int capacityIncrement)
        Vector v3 = new Vector(5, 3);
        System.out.println(v3.capacity());// 5
        v3.addElement(1);
        v3.addElement(2);
        v3.addElement(3);
        v3.addElement(4);
        v3.addElement(5);
        v3.addElement(6);
        System.out.println(v3.capacity());// 8
        //4)Vector v4=new Vector(Collection c);
        LinkedList ll=new LinkedList();
        ll.add("Vaibhav");
        ll.add("Prashant");
        ll.add("Rajesh");
        Vector v4=new Vector(ll);
        v4.add(50);
        System.out.println(v4);
    }
}

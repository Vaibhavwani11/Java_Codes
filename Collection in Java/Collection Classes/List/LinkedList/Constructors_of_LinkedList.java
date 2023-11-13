import java.util.*;
public class Constructors_of_LinkedList {
    public static void main(String [] arsg){

        //1)
        LinkedList ll=new LinkedList();
        ll.add(1);
        ll.add("two");
        System.out.println(ll);
        
        //2) LinkedList ll=new LinkedList(Collection c);
        ArrayList al=new ArrayList(ll);
        al.add("Four");
        al.add("3");
        System.out.println(al);
    }
}

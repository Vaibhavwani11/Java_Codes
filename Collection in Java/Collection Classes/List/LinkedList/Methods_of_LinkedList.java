import java.util.*;
public class Methods_of_LinkedList {
    public static void main(String [] args){

        LinkedList ll=new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30.5f);

        System.out.println(ll);
        //1)add(index,Object)
        ll.add(3,"Java Developer");
        System.out.println(ll);
        //2)addFirst(Object e)
        ll.addFirst("Full Stack");
        System.out.println(ll);
        //3)addLast(Object e)
        ll.addLast("Vaibhav");
        System.out.println(ll);
        //4)removeFirst();
        ll.removeFirst();
        System.out.println(ll);
        //5)indexOf(Object o)
        System.out.println(ll.indexOf("Vaibhav"));
        //6)set(int index,Object Element)
        ll.set(2,"Data Scientist");
        System.out.println(ll);


    }
}

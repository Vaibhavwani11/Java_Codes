import java.util.*;
//Insertion order is Preserved in LinkedHashSet
public class LinkedHashSet_demo {
    public static void main(String [] args){

        LinkedHashSet ls=new LinkedHashSet();
        ls.add("Amazon");
        ls.add("Microsoft");
        ls.add("Google");
        ls.add("Apple");

        System.out.println(ls);
    }
}

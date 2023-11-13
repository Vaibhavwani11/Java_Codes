/*In List Interface: i)duplicate data can be inserted
                     ii)Indexing is valid on List
                     iii)Insertion order is preserved in List */
import java.util.*;
class ArrayList_demo {

    public static void main(String [] args){

        //ArrayList is class under List Interface 
        ArrayList al=new ArrayList();
        al.add("Vaibhav");
        al.add("Web Devlopment");
        al.add("DSE Sheet");
        al.add("Perfect Programming Knowledge");
        
        System.out.println(al);
        //System.out.println(al[0]);  cannot access like this

        System.out.println("Accessing using iterator: ");
        Iterator i= al.iterator();

        System.out.println(i.next());
        System.out.println("=====");
        while(i.hasNext()){
            System.out.println(i.next());
        }


        ArrayList al2=new ArrayList();
        al2.add("Microsoft");
        al2.add("Offer");

        System.out.println(al2);
        al2.addAll(al);
        System.out.println(al2);
    }
}

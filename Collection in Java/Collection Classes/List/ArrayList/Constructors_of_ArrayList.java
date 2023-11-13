import java.util.*;
public class Constructors_of_ArrayList {

    public static void main(String [] args){

        //1) Default capacity is 10-open doc to ensure
        ArrayList al=new ArrayList();
        //System.out.println(al.capacity()); //ArrayList doesn't has capacity method
        System.out.println(al.size()); //0

        //2)ArrayList al2=new ArrayList(int initcapacity);
        ArrayList al2=new ArrayList(100);

        al2.ensureCapacity(300); //This is Method of ArrayList. if we want to change the capacity, after once declared at the time of initialization

        //3)ArrayList al=new ArrayList(Collection obj);  -:)We can pass(add) any obj of collection type(i.e. ArrayList,LinkedList,Vector,etc.) to this Collection
        ArrayList l1=new ArrayList();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        System.out.println(l1); //[10,20,30]

        ArrayList l2=new ArrayList(l1);
        l2.add(40);
        System.out.println(l2); //[10,20,30,40]
    }
}

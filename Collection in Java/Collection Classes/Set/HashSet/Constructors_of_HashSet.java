import java.util.*;
public class Constructors_of_HashSet {
    public static void main(String [] args){

        //1)default capacity is 16,default fill ratio=0.75f(When set is filled 75% its capacity will be increased)
        HashSet s=new HashSet();  
        //2)HashSet s=new HashSet(int initialCapacity);
        HashSet hs=new HashSet(10);
        //System.out.println(hs.capacity()); //method not present
        //3)HashSet s1=new HashSet(int initialCapacity, float loadFactor)
        HashSet s1=new HashSet(15, 0.8f);
        //4)HashSet s2=new HashSet(Collection obj)
        HashSet s2=new HashSet();
    }
}

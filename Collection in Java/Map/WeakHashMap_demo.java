import java.util.*;
class WeakHashMap_demo {
    public static void main(String [] args){

        WeakHashMap<String,Integer> h=new WeakHashMap<String,Integer>();
        
        String s1=new String("Vaibhav");
        String s2=new String("Rajesh");

        h.put(s1,11);
        h.put(s2,2);

        System.out.println(h);

        s1=null;
       //Garbage collector can delete/clear null keys from WeakHashMap but can't clean from HashMap or any Other Map.
        System.gc();
        System.out.println(h);
    }   
}

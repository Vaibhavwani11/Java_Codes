import java.util.*;
class IdentityHashMap_demo {
    public static void main(String [] args){

        //IdentityHashMap can have same keys
        IdentityHashMap<String,Integer> m=new IdentityHashMap<>();
        
        String s1=new String("Vaibhav");
        String s2=new String("Vaibhav");
        
        m.put(s1,11);
        m.put(s2,1);

        System.out.println(m);
    }   
}

import java.util.*;
class Student{
    public static void main(String [] args){

        Map<Integer,String> m= new HashMap<Integer,String>();
        m.put(78,"Vaibhav");
        m.put(100,"Alekh");
        m.put(75,"Shreyash");

        System.out.println(m);
        
        //Adding same key again
        m.put(76,"Yash");  //Only this key will be considered(previous will be replaced by this)
        System.out.println(m); 
        
        //Adding same value again
        m.put(70,"Vaibhav"); //NO effect(Same values are allowed)
        System.out.println(m);
    }
}
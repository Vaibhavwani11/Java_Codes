import java.util.*;
import java.lang.*;
public class SortedSet_demo {
    public static void main(String [] args){
    
        SortedSet ss=new TreeSet(); //SortedSet is an Interface
        ss.add("BMW");
        ss.add("Mercedes");
        ss.add("Audi");
        ss.add("Rolls Royce");
        ss.add("MG"); //MG will come before Mercedes bcoz ASCII values are compared and ASCII of capitals are less than small numbers

        System.out.println(ss); //in sorted manner

        SortedSet s1=new TreeSet();
        s1.add(10);
        s1.add(new Integer(20));
        s1.add(18);
        s1.add(new Integer(2));
    
        System.out.println(s1); //in sorted manner

        //SortedSet mdhe fakt comparable type cha ch data chalto..that class must implement Comaparable Interface
        //String,Integer,Float ya sarv class ni Comparable la implement kel ahe.
    
        SortedSet s2=new TreeSet();
        s2.add(new StringBuffer("Vaibhav")); //StringBuffer ne Comparable Interface la implement kel nahi ahe so ithe chalnar nahi
    }
}

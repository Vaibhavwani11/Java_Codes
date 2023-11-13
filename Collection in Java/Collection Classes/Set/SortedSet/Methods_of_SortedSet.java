import java.util.*;
class Methods_SortedSet{
    public static void main(String [] args){

       SortedSet ss=new TreeSet();

        ss.add("C");
        ss.add("Cpp");
        ss.add("Java");
        ss.add("Python");
        System.out.println(ss);

        System.out.println(ss.first());
        //2)
        System.out.println(ss.last());
        //3)
        System.out.println(ss.headSet("Cpp"));
        //4)
        System.out.println(ss.tailSet("Cpp"));
        //5)
        System.out.println(ss.subSet("Cpp","Python"));
    }
}

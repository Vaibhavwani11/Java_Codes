import java.util.*;
public class Methods_of_HashSet {
    public static void main(String [] args){

        Set s=new HashSet();
        s.add("Sundar Pichai");
        s.add("Satya Nadella");
        s.add("S NarayanMurthi");
        s.add("Anand Deshpande");

        Iterator i= s.iterator();
        while(i.hasNext()){

            System.out.println(i.next());
        }
        //1)contains(Collection obj)
        System.out.println(s.contains("Ratan Tata")); //false
        //2)
        System.out.println(s.size());
        //3)
        s.remove("Sundar Pichai");
        System.out.println(s);
        //4)
        s.clear();
        System.out.println(s);
    }
}

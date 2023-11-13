import java.util.*;
public class Methods_of_ArrayList {
    
    public static void main(String [] args){

        ArrayList al=new ArrayList();
        al.add("Microsoft");
        al.add("Google");
        al.add("Amazon");
        al.add("Microsoft");
        System.out.println(al); //[Microsoft, Google, Amazon, Microsoft]
    //1)add(index,Object);
        al.add(1,"Veritas");
        System.out.println(al);//[Microsoft, Veritas, Google, Amazon, Microsoft]
    
    //2)indexOf(Object);
    System.out.println(al.indexOf("Amazon")); //3
    System.out.println(al.indexOf("EQTech")); //-1 (as it is not in the List)
    //3)lastIndexOf(Object);
    System.out.println(al.lastIndexOf("Microsoft")); //4
    //4)size();
    System.out.println(al.size()); //5
    //5)remove(int index)
    al.remove(4);
    System.out.println(al); //[Microsoft, Veritas, Google, Amazon]
    //6)remove(Object obj);
    al.remove("Amazon");  
    System.out.println(al); //[Microsoft, Veritas, Google]
    //7)clone();
    //ArrayList al2= al.clone(); //error:return type of clone is object,so we'll need to typecast it.
    ArrayList al3= (ArrayList)al.clone();
    System.out.println(al3); //[Microsoft, Veritas, Google]
    //8)clear()
    al3.clear();
    System.out.println(al3); //[]
    
    }
}

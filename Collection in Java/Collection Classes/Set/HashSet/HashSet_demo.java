//Duplicate value is not allowed in Set.
//Insertion order is not Preserved in HashSet 
import java.util.HashSet;
class HashSetDemo{
    public static void main(String [] arsg){

        HashSet hs=new HashSet();
        hs.add("C");
        hs.add("Cpp");
        hs.add("Java");
        hs.add("Python");

        System.out.println(hs);

        hs.add("Java"); //Trying to add duplicate values
        System.out.println(hs); //Error is not given but value is not stored in hashSet

        System.out.println(hs.add("Flutter")); //true (Value can be added)
        System.out.println(hs.add("Java")); //false (duplicate Value can not be added)

        System.out.println(hs);
    }
}
import java.util.*;

class LinkedHashMap_demo {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> lm = new LinkedHashMap<>();

        //Insertion order is preserved in LinkedHashMap
        lm.put(78, "Vaibhav");
        lm.put(76, "Alekh");
        lm.put(75, "Shreyash");
        lm.put(35, "Shubham");

        System.out.println(lm);
    }
}
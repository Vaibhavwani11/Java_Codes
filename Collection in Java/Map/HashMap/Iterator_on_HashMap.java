import java.util.*;
class Iterator_on_HashMap {
    public static void main(String [] arga){

        Map<Integer,String> m=new HashMap<>();
    
        m.put(78,"Vaibhav");
        m.put(76,"Alekh");
        m.put(75,"Shreyash");
        m.put(35,"Shubham");
    
        System.out.println(m.entrySet());

        Set<Map.Entry<Integer,String>> s=m.entrySet();

        Iterator itr= s.iterator();
        while(itr.hasNext()){

            Map.Entry<Integer,String> actualEntry= (Map.Entry<Integer,String>)itr.next();

            if(actualEntry.getKey().equals("75")){

                actualEntry.setValue("Pravin");
            }
           //System.out.println(actualEntry.getKey());
        }
        System.out.println(m);
        System.out.println(s);
    }
}

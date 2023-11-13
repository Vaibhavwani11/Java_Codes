import java.util.*;
class Methods_of_HashMap {

    public static void main(String [] args){

        Map m= new HashMap();
        
        //1)put(Object key,Object value)
        m.put("Amazon","Jeff Bezos");
        m.put("Microsoft","Bill Gates");
        m.put("Apple","Steve Jobs");
        m.put("SpaceX","Elon Musk");

        System.out.println(m.);
        //2)get(key)
        System.out.println(m.get("Microsoft"));  //Return value

        //3)remove(key)
        m.remove("Apple");
        System.out.println(m.remove("Apple"));
        
        //4)containsKey(Object key)
        System.out.println(m.containsKey("Apple"));
        
        //4)containsValue(Object value)
        System.out.println(m.containsValue("Elon Musk"));
        
        //5)isEmpty()
        System.out.println(m.isEmpty());
        
        //6)size()
        System.out.println(m.size());
        
        //7)keySet()
        System.out.println(m.keySet());
        
        //8)values()
        System.out.println(m.values());
        
        //9)entrySet()..(Important Method)
        System.out.println(m.entrySet());
    }
}

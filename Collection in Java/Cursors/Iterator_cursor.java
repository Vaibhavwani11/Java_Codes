import java.util.*;
class Iterator_cursor {
    public static void main(String [] args){

        Vector v=new Vector();

        v.addElement(10);
        v.addElement(20);
        v.addElement(30);
        v.addElement(40);
        
        System.out.println(v);
        
        Iterator i= v.iterator(); //iterator is method of Iterator cursor 
        //that vector is passed to object of Iterator i.e.'i'
    
        while(i.hasNext()){
            Integer val=(Integer)i.next();
            if(val%4==0)
                System.out.println(val);
        }
        i=v.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}

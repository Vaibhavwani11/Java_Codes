import java.util.*;
class ListIterator_cursor {
    public static void main(String [] args){

        LinkedList ll=new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        System.out.println(ll);

        ListIterator li= ll.listIterator();  //we passed linkedlist named ll to obj of ListIterator "li"
        
        while(li.hasNext()){
           
      //    System.out.println(li.next());            
            Integer I=(Integer)li.next();
            if(I==20){
                li.set(50);
            }
        }
        while(li.hasPrevious()){
            System.out.println(li.previous())
        }
    }
}

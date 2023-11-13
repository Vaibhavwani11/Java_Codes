import java.util.*;
class BigBazar{

    String prodName;
    float price;

    BigBazar(String prodName,float price){
        this.prodName=prodName;
        this.price=price;
    }
    void disp(){
        System.out.println(prodName+" "+price);
    }
}
class LinkedList_demo{
    public static void main(String [] args){

        LinkedList ll=new LinkedList();
        ll.add(new BigBazar("Gahoo",45.0f));
        ll.add(new BigBazar("Bajari",50));
        ll.add(new BigBazar("Tandool",30.59f));

        System.out.println(ll);

        Iterator i= ll.iterator();
        while(i.hasNext()){
            BigBazar obj=(BigBazar)i.next();
            obj.disp();
        }
    }
}
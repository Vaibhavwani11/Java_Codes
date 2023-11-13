import java.util.*;
class Newadkar{
    
    String Name;
    String Place;
    int age;
    
    Newadkar(String Name,String Place,int age){
        this.Name=Name;
        this.Place=Place;
        this.age=age;
    }
    void disp(){
        System.out.println(Name+" "+Place+" "+age);
    }
}
class SortbyName implements Comparator<Newadkar>{

        public int compare(Newadkar obj1,Newadkar obj2){
            return obj1.Name.compareTo(obj2.Name);
        }
}
class ComparatorDemo{
    public static void main(String [] arsg){
 
        LinkedList<Newadkar> ll=new LinkedList<Newadkar>();
        ll.add(new Newadkar("Vaibhav","Murbad",19));
        ll.add(new Newadkar("Jitendra","Pune",30));
        ll.add(new Newadkar("Sachin","Dhule",35));
        ll.add(new Newadkar("Sagar","Nashik",29));

System.out.println("Sorted by Name:");
        Collections.sort(ll,new SortbyName());
        for(Newadkar n: ll){
            n.disp();
        }
System.out.println("Sorted by Age using Anonymous Inner Class:");
        Comparator<Newadkar> SortbyAge= new Comparator<Newadkar>(){
          
            public int compare(Newadkar obj1,Newadkar obj2){
                return (obj1.age-obj2.age);
            }
        };
        Collections.sort(ll,SortbyAge);
        for(Newadkar n: ll){
            n.disp();
        }
    }
}

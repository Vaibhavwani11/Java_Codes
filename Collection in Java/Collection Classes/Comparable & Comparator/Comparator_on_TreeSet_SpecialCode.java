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
    public String toString(){
        return Name+" "+Place+" "+age;
    }
}
class SortbyName implements Comparator<Newadkar>{

        public int compare(Newadkar obj1,Newadkar obj2){
            return obj1.Name.compareTo(obj2.Name);
        }
}
class Data{
    public static void main(String [] arsg){

        TreeSet<Newadkar> ts=new TreeSet<Newadkar>(new SortbyName());
        ts.add(new Newadkar("Vaibhav","Murbad",19));
        ts.add(new Newadkar("Jitendra","Pune",30));
        ts.add(new Newadkar("Sachin","Dhule",35));
        ts.add(new Newadkar("Sagar","Nashik",29));

System.out.println("Sorted by Name of TreeSet data:");
        Collections.sort(ts);
        for(Newadkar n: ts){
            //n.disp();
        }
System.out.println("Sorted by Age using Anonymous Inner Class:");
        Comparator<Newadkar> SortbyAge= new Comparator<Newadkar>(){
          
            public int compare(Newadkar obj1,Newadkar obj2){
                return (obj1.age-obj2.age);
            }
        };
        Collections.sort(ts,SortbyAge);
        for(Newadkar n: ts){
           // n.disp();
        }
    }
}


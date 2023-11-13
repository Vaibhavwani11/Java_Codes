import java.util.*;
class Company{    

    String compName;
    long sal;

    Company(String compName,long sal){
        this.compName=compName;
        this.sal=sal;
    }
    //If you print any object, java compiler internally invokes the toString() method on the object.
    public String toString(){
        return "("+compName+","+sal+")";
    }
}
class Friends{
    public static void main(String [] args){

        Map m=new HashMap();
        m.put("Vaibhav",new Company("Microsoft",4300000));
        m.put("Suraj",new Company("Amazon",3800000));
        m.put("Madhur",new Company("Google",3300000));
        m.put("Shubham",new Company("Microsoft",4300000));

        System.out.println(m);
    }
}

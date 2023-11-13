//To sort data our class must implement Comparable Interface.
//Comparable has only one abstract method-compareTo which must be implemented by our class.
import java.util.Collection;
import java.util.*;
public class Employee implements Comparable<Employee>{

    int empId;
    String empName;
    float empSal;
    Employee(int empId,String empName,float empSal){
        this.empId=empId;
        this.empSal=empSal;
        this.empName=empName;
    }
    public int compareTo(Employee obj){
        return (int)(empSal-obj.empSal);
    }
    void disp(){
        System.out.println(empId+" "+empName+" "+empSal);
    }
}
public class Data{
    public static void main(String [] args){

        LinkedList<Employee> ll=new LinkedList<Employee>();
        ll.add(new Employee(11,"Vaibhav",98000f));
        ll.add(new Employee(13,"Shubham",95000.5f));
        ll.add(new Employee(12,"Alekh",90000.5f));

        System.out.println(ll);
        Collections.sort(ll); //TreeSet is under SortedSet so it automatically calls compareTo method and does sorting 
//but LinkedList doesn't do sorting by its own..so we have to call "sort" method of "Collections" class and pass our LinkedList to sort the data.
//sort method will call compareTo() method

        for(Employee e: ll){
            e.disp();
        }
    }
}

import java.util.*;
//To compare more than one instances/variables at a time Comparator is used
//It has 2 abstract methods:Compare,equals
//we need to give body to Compare method only, bcoz In Object class body to equals() method is given.(As our class by default extends Object so equals() is inherited)
class Employee{
    int empId;
    String empName;
    float sal;

    Employee(int empId, String empName, float sal) {
        this.empId = empId;
        this.empName = empName;
        this.sal = sal;
    }
    void disp(){
        System.out.println(empId+" "+empName+" "+sal);
    }
}
class SortbySal implements Comparator<Employee>{
    public int compare(Employee obj1,Employee obj2){
        return (int)(obj1.sal-obj2.sal);
    }
}
class SortbyName implements Comparator<Employee>{
    public int compare(Employee obj1,Employee obj2){
        return obj1.empName.compareTo(obj2.empName);
    }
}
class Data {
    public static void main(String[] args) {

        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(new Employee(1, "Shubh", 85000f));
        al.add(new Employee(2, "Raj", 88000f));
        al.add(new Employee(3, "Omkar", 70000f));
    
        SortbySal sbs=new SortbySal();
        Collections.sort(al,sbs);
        // for each loop
        for (Employee e : al) {
            e.disp();
        }
System.out.println("==========");

        Collections.sort(al,new SortbyName());
        for(Employee e:al){
            e.disp();
        }
    }
}

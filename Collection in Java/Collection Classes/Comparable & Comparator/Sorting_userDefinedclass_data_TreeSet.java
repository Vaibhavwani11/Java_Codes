import java.util.*;
class Employee implements Comparable<Employee> {

    int empId;
    String empName;
    float sal;

    Employee(int empId, String empName, float sal) {
        this.empId = empId;
        this.empName = empName;
        this.sal = sal;
    }

    public int compareTo(Employee obj) {
        return (int) (sal - obj.sal);
    }
}
class Data {
    public static void main(String[] args) {

        SortedSet<Employee> s = new TreeSet<Employee>();
        s.add(new Employee(1, "Shubh", 85000f));
        s.add(new Employee(2, "Raj", 80000f));
        s.add(new Employee(3, "Omkar", 90000f));
        
        // for each loop
        for (Employee e : s) {
            System.out.println(e.empName);//Sorted according to sal
        }
    }
}

import javax.swing.event.InternalFrameEvent;
import javax.swing.event.SwingPropertyChangeSupport;

class Employee implements Cloneable{

    int empId;
    String name;
    double sal;
    Employee(int empId, String name, double sal){

        this.empId=empId;
        this.name=name;
        this.sal=sal;
    }
}
class Methods_of_Object implements Cloneable{ //marker interface(not having any method)
     //overriding equals method of object class
   // @Override
    public boolean equals(Object obj){

        System.out.println("In m1");

        /*Employee emp=(Employee)obj;
        System.out.println(emp.empId+"    "+this.empId);
        if(emp.empId=this.empId){
            return true;
        }
        else{
            return false;
        }*/
        return ((Employee)obj).empId.equals(this.empId);
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        
    // 1.equals() method
    // equals(Object obj)
    // Indicates whether some other object is "equal to" this one.
    
        Integer x= new Integer(50);
        Float y= new Float(50f);

        System.out.println(x.equals(y)); //false
        System.out.println(x.equals(50)); //true;

        Employee emp1=new Employee(10, "Vaibhav", 900000);
        Employee emp2=new Employee(10, "Vaibhav", 900000);
        //Employee emp2=emp1;

        System.out.println("In main");

        if(emp1.equals(emp2)){
            System.out.println("Equal!");
        }
        else{
            System.out.println("Not Equal!");
        }
    
// 2. Returns a hash code value for the object. ( public int hashCode()  )
//This method is supported for the benefit of hash tables such as those provided by HashMap.   
//each object has some hashcode for the use in hash tables
    System.out.println(emp1.hashCode());
    
// 3.protected Object clone()
// throws CloneNotSupportedException
        Employee e1= new Employee(11, "Alekh", 85000);  
        // try{
            
        //   //  Employee e2= (Employee)e1.clone();
        //   //  System.out.println(emp1.empId+" "+e2.empId);
        // }
        // catch(CloneNotSupportedException ce){
        //     ce.printStackTrace();
        //  }
// 4.finalizes object during garbage collection
// 5.toString():
// public String toString()
// Returns a string representation of the object. 
//In general, the toString method returns a string that "textually represents" this object. The result should be a concise but informative representation that is easy for a person to read. 
//It is recommended that all subclasses override this method.
// The toString method for class Object returns a string consisting of the name of the class of which the object is an instance, the at-sign character `@', and the unsigned hexadecimal representation of the hash code of the object. 
//In other words, this method returns a string equal to the value of:
//  getClass().getName() + '@' + Integer.toHexString(hashCode())
 
         System.out.println(e1.toString());

    }
}


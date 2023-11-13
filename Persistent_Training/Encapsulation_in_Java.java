//Encapsulation is "Data Hiding!"

public class Encapsulation_in_Java {
    
    //data hiding (using private access modifier)
    private int empCnt;
    private String address;
    private String name;

    //we want object to be accessible, but we don't want properties(functions and variables) of object to be accessible.
    public Encapsulation_in_Java(int empCnt, String address, String name){

        this.empCnt=empCnt;
        this.address=address;
        this.name=name;
    }

    //writing getters and setters, to give access to private properties of class
    //here we are deciding our own way of providing access to the properties of this particular class
    public int getCnt(){
        return empCnt;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    //setter methods, if you want to change the values of variables
    public void setCnt(int empCnt){
        this.empCnt=empCnt;
    }
    public void setName(int name){
        this.name=name;
    }
    public void setAdd(String address){
        this.address=address;
    }
}
class Vaibhav{

    public static void main(String[] args) {
        
        Encapsulation_in_Java obj= new Encapsulation_in_Java(100, "Pune", "VebTech");

        System.out.println( obj.getAddress());
        System.out.println( obj.getName() );
        System.out.println( obj.getCnt() );
    }
}

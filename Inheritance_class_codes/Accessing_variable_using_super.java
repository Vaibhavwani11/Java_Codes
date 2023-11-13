class Parent {
    
    int x=10;
    Parent(){
        System.out.println("In parent constructor");
    }
}
class Child extends Parent{

    int x=20;
    Child(){
        System.out.println("In child constructor");
    }
    class Inner{

        
    }
}
class Vaibhav{

    public static void main(String[] args) {
        
        Child obj=new Child();
        obj.super.x;
    //     System.out.println(obj.x);
    //    System.out.println(obj.super.x);

    //     Parent ref= new Child();
    //     System.out.println(ref.x);
    //     System.out.println(r.super.x);
    }
}
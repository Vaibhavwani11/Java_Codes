class Vaibhav{

    static Vaibhav obj1=new Vaibhav();
}
class PTC{

    static PTC obj2=new PTC();
}
class Test{

    public static void main(String [] a){

        System.out.println(Vaibhav.obj1.equals(PTC.obj2));
    }
}
class Promotion{
  
    void fun(char x){
            
        System.out.println(x);
    }
    /*void fun(float y){

        System.out.println("float");
    }*/
    public static void main(String [] arsg){

        Promotion obj=new Promotion();
        obj.fun(10.5);
    }
}
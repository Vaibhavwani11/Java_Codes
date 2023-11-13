class catching_using_Exception {
    public static void main(String[] args) {
        
        try{
            System.out.println(10/0);
        }
        catch(Exception e){

            System.out.println("In Exception");
            e.printStackTrace(); //return type of printStackTrace is void.
            //So, it cannot be written in S.o.p;
           //System.out.println(e.printStackTrace());
        }
    }
}

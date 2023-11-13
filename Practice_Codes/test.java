package Practice_Codes;

public class test {

    public static void main(String[] args) {
        
        String S="011100";
        long binaryLong=Long.parseLong(S,2);
        double result=Double.longBitsToDouble(binaryLong);

        int operations=0;
        while(result!=0){

            if(result%2==0){
                result=result/2;
            }
            else{
                result=result-1;
            }
            operations++;
        }
        System.out.println(operations);
    }
    
}

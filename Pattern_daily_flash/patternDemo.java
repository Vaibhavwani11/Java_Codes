

/*
Write a java code to Print the following Pattern:
3 3 3 3 3
3 2 2 2 3
3 2 1 2 3
3 2 2 2 3
3 3 3 3 3
*/
class Swquarep{
    public static void main(String[] args) {
        

        int num=5;
        int k=num/2 + 1;

        for (int i = 1; i <= num; i++) {
            
            for (int j = 1; j <= num; j++) {

               // System.out.print(k+" ");
                
                if(i==5 || i==1 || j==1 || j==5 ){
                    System.out.print(k+" ");
                    continue;
                }
                else if(j==i+1 || j==num-i){
                 System.out.print((k-1)+" ");
                    continue;
                }
                else{
                    System.out.print("= ");
                }
              //  k--;
            }
            System.out.println();
        }
    }
}

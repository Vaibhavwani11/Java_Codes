/*
    *
   *  * 
*  *  *  
*  *  *  *  
*  *  *  *  *
*  *  *  *
*  *  *  
*  * 
*
*/ 
class diamond_pattern {
    
    public static void main(String[] args) {
        
        int n=4;

        //upper pyramid
        for(int i=1; i<=n; i++){

            //space
            for(int j=n-1; j>=i; j--){

                System.out.print("  ");
            }
            //stars
            for(int k=1; k<=2*i-1; k++){

                System.out.print("* ");
            }
            System.out.println();
        }

        //lower pyramid
        for(int i=1; i<n; i++){

            //space
            for(int j=1; j<=i; j++){
                System.out.print("  ");
            }
            //stars

            for(int k=2*(n-1)-i; k>=i; k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

import java.io.*;
/*
      *
    * * *
  * * * * *
* * * * * * *
 */
class Pyramid_try {
    
    public static void main(String[] args) throws IOException{
        
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);

        System.out.println("Enter no. of rows: ");
        int rows;
        rows= Integer.parseInt(br.readLine());

        for(int i=1; i<=rows; i++){
            
            //to handle space
            for(int j=rows-1; j>=i; j--){
                System.out.print("  ");
            }
            //stars
            for(int k=1; k<= 2*i-1; k++){
                System.out.print("* ");
            }
            System.out.println("");
        }

        // for(int i=1; i<=rows; i++){

        //     //to handle space
        //     for(int j=rows; j>i; j--){

        //         System.out.print("  ");
        //     }
        //     //to print pattern
        //     for(int k=1; k<=2*i-1; k++){

        //         System.out.print("* ");
        //     }
        //     System.out.println("");
        // }
    }
}

import java.io.*;

class try_diamond {

    public static void main(String[] args) throws IOException{
            
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);

        System.out.println("Enter no. of rows: ");
        int rows;
        rows= Integer.parseInt(br.readLine());

        for(int i=1; i<=rows; i++){

            //to handle space
            for(int j=rows; j>i; j--){

                System.out.print("  ");
            }
            //to print pattern
            for(int k=1; k<=2*i-1; k++){

                System.out.print("* ");
            }
            System.out.println("");
        }
      //  System.out.println();
      rows--;
        for(int i=1; i<=rows; i++){

            //to handle space
            for(int j=1; j<=i; j++){

                System.out.print("  ");
            }
            //to print * pyramid
            for(int k=i; k<=rows*2 - i; k++){

                System.out.print("* ");
            }
            System.out.println("");

        }
    }
}

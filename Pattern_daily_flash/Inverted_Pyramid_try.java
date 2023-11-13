import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Pyramid_Inverse{
    public static void main(String[] args) throws IOException{
        
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);

        System.out.println("Enter number of rows: ");
        int rows=Integer.parseInt(br.readLine());

        for(int i=1; i<=rows; i++){

            //to handle space
            for(int j=1; j<i; j++){

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
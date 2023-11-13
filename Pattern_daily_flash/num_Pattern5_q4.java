/*
Write a java code to Print the following Pattern:
1
1 0
1 0 1
1 0 1 0
1 0 1 0 1
*/
import java.io.*;
class PatternCode{

    public static void main(String[] args) throws IOException{
        
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);

        //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number: ");
        int num= Integer.parseInt(br.readLine());

        for (int i = 1; i <= num; i++) {
            int x=1;
            
            for (int j = 1; j <= i; j++) {
                
                System.out.print(x+" ");
                
                if(j%2==0)
                    x=1;
                else
                    x=0;
            }
        System.out.println("");
        }
    }

}

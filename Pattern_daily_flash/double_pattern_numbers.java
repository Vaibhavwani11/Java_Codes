/*
1 
2 3 4 5 6 7
8 9 10 11 12 13 14
15 16 17 18 19 20 21 22
23 24 25 26
1 2 3 4 5 6 7 8 9 10 
11 12 13 14 15 16 17 18 19 20 21
22 23 24 25 26 27 28 29 30 31 32 33
34 35 36 37
*/

import javax.sound.sampled.SourceDataLine;
import java.util.*;
class double_pattern_code {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        printPattern(num);
    }
    static void printPattern(int num){

        int k=1;
        for (int i = 1; i <= num*2; i++) {

            for (int j = 1; j<=i; j++) {
                
                if(i==5){
                    k=1;
                    break;
                }
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
            for (int j =num*2; j >num; j--) {
                
                System.out.print(k+" ");
                k++;
            }
        }
    }
}

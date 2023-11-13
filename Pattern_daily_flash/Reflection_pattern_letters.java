/*
Write a java code to Print the following Pattern:
A B C D E F
A B C D E
A B C D
A B C
A B
A
A
A B
A B C
A B C D
A B C D E
A B C D E F
*/
import java.util.Scanner;
class ReflectionLetters{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        //upper pattern
        for (int i = 0; i < num; i++) {
            char ch='A';
            for (int j = num; j > i ; j--) {
                
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
        //lower pattern
        for (int i = 0; i < num; i++) {
            char ch='A';
            for (int j = 0; j <= i; j++) {
                
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}



/*
Write a java code to Print the following Pattern:
= = = = =
= = = = 
= = = 
= = 
=
* 
* *
* * * 
* * * * 
* * * * *

*/
class Reflection{
    public static void main(String[] args) {
        
        //upper pattern
        for (int i = 0; i < 5; i++) {
            
            for (int j = 5; j > i ; j--) {
                
                System.out.print("= ");
            }
            System.out.println();
        }
        //lower pattern
        for (int i = 0; i < 5; i++) {
            
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

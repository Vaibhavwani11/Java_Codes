/*1 2 3 4 5 6 7        4*2 - i = 7
    1 2 3 4 5           6
      1 2 3             5 
        1               4
*/
class inverted_pyramid {
    public static void main(String[] args) {
  
        int n=5;

        for(int i=n; i>=1; i--){

            //space
            for(int j=n; j>i; j--){

                System.out.print("  ");
            }
            //numbers
            int m=1;
            for(int k=2*i-1; k>=1; k--){

                System.out.print(m+" ");
                m++;
            }
            System.out.println();
        }

        // for (int i = 1; i <= n; i++) {
            
        //     //to handle space
        //     for (int j = 1; j < i ; j++) {
        //         System.out.print("  ");
        //     }
        //     //to print values
        //     for (int k = i; k <= n*2 - i; k++) {
            
        //         System.out.print(k+" ");
        //     }
        //     System.out.println();
        // }
    }
}

/*
      0
    0 1 0
  0 1 2 1 0
0 1 2 3 2 1 0
0 1 2 3 2 1 0
  0 1 2 1 0
    1 0 1
      0
  */

class Diamond_pattern_numbers {
    public static void main(String[] args) {
        
        //first print upper pattern
        for (int i = 1; i <= 5; i++) {
            
            //to handle spaces
            for (int j = 5; j >= (i+1) ; j--) { //as we want to print 4 spaces in 1st row when there are total 5 rows
                //means we are printing (n-1) spaces in 1st row.
                //try by substituting values in j 
                System.out.print("  ");
            }
            int num=0;
            //to print pyramid like pattern
            for (int k = 1; k <= (i*2)-1; k++) {
                System.out.print(num+" ");
                if(k<i){
                    num++;
                }
                else{
                    num--;
                }
            }
            System.out.println();
        }//now upper pyramid is printed

        //to print lower reflection
        for (int i = 1; i <=5 ; i++) {
            
            //to handle spaces
            for (int j = 1; j <= i-1; j++) {
                System.out.print("  ");
            }
            int num=0;
            //to print values
            for (int k = i; k <= 5*2 - i ; k++) {

                System.out.print(num+" ");
                if(k<=5-1){
                    num++;
                }
                else{
                    num--;
                }
            }
            System.out.println();
        }
        
    }
}

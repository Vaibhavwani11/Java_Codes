/*You will be given two integers and as input, you have to compute.If and are not bit signed integers or if 
 is zero, exception will occur and you have to report it. Read sample Input/Output to know what to report in case of exceptions.

Sample Input 1:
 10
 Hello
Sample Output 1:
  java.util.InputMismatchException

Sample Input 2:
  10
  0
Sample Output 2:
 java.lang.ArithmeticException: / by zero
*/
class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       int x=0,y=0;
        //InputStreamReader isr=new InputStreamReader(System.in);
        //BufferedReader br=new BufferedReader(isr);
        Scanner sc=new Scanner(System.in);
        int ans=0;

        try{

            x= sc.nextInt();
            y=sc.nextInt();

            System.out.println(x/y);
            // x=Integer.parseInt(br.readLine());
            //y=Integer.parseInt(br.readLine());
        }
        catch(InputMismatchException ie){

         System.out.println("java.util.InputMismatchException");

        }
        catch(ArithmeticException ie){

         System.out.println("java.lang.ArithmeticException: / by zero");

        }
       // System.out.println(ans);
    }
}

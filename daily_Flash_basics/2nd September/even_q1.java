/*Program 1: Write a Program to print series of Even numbers ranging between
two numbers entered by user.
Input:
Min of Series : 4
Max of Series: 60
Output: Series Of Even Numbers Ranging between 4 & 60 is:
4, 6, 8, . . ., 60
*/
import java.io.*;
class even{

	public static void main(String [] args)throws IOException{
	
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);

		System.out.printf("Enter min & max of series:\n");

		int min= Integer.parseInt(br.readLine());
		int max= Integer.parseInt(br.readLine());

		for(; min<=max; min++){
		
			if(min%2==0)
				System.out.printf("%d ",min);
		}

	}
}

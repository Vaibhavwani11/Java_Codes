/*Write a program to print following binary pattern.
 Take number of row from user using Scanner class. 
Input: 
     No Of Rows: 5 
     01010
     10101 
     01010
     10101
     01010 */
import java.util.*;
class Pattern{

	public static void main(String [] args){
	
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter No. of rows: ");
		int rows=sc.nextInt();
			
		//boolean num=false;
		int num=0;
		int n=num;
		for(int i=0; i<rows ; i++){
			
			for(int j=0; j<5; j++){
					
				System.out.print(n);
				n=!num;	
			}
			System.out.println("");
		}
	}
}

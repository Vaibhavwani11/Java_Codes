/*Write a program to take input of 3 numbers using BufferedReader class and print them
in ascending and descending order.
Input:
	6 50 33
	Output:
	Ascending order is: 6 33 50.
	Descending order is: 50 33 6.
{Note: Do not sort. Use if-else to set min, mid and max and print accordingly.}
*/
import java.io.*;
class order{

	public static void main(String [] args)throws IOException {
	
		InputStreamReader isr= new InputStreamReader(System.in);

		BufferedReader br= new BufferedReader(isr);

		System.out.println("Enter three Numbers:");
		
		int num1=Integer.parseInt(br.readLine());
		int num2=Integer.parseInt(br.readLine());
		int num3=Integer.parseInt(br.readLine());

		int max,mid,min;

		if(num1>num2){
		
			if(num1>num3){
				System.out.println(num1+" is max");
				max=num1;
				
				if(num2>num3){
					mid=num2;
					min=num3;
				}
				else{
				
					mid=num3;
					min=num2;
				}

			}
		
			else{
				System.out.println(num3+" is max");
				if(num1>num2){
					max=num3;
					mid=num1;
					min=num2;
				}
				else{
				
					max=num3;
					mid=num2;
					min=num1;
				}
			}
		}
		else{
		
			if(num2>num3){
				System.out.println(num2+" is max");
				max=num2;

				if(num1> num3){
					mid=num1;
					min=num3;
				}
				else{
					mid=num3;
					min=num1;
				}
			}
			else{
				System.out.println(num3+" is max");
		
				if(num1>num2){
					max=num3;
					mid=num1;
					min=num2;
				}
				else{
					max=num3;
					mid=num2;
					min=num1;
				}
			}
			
		}
	System.out.printf("Descending order: %d %d %d\n",num3,num2,num1);
	System.out.printf("Ascending order: %d %d %d\n",num1,num2,num3);

	}

}

/*
 Write a program to take integer value from user in loop,
 display sum of value's entered.
 If value entered is greater than 50 then break the loop(choose any loop of your choice)
Input: 1 5 10 15 60 
Output: sum=91
 */
import java.io.*;
class sum{

	public static void main(String [] args)throws IOException{
	
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		int sum=0;
		int cnt=1;
		while(cnt<=10){
			
			System.out.println("Enter number:");
			int num=Integer.parseInt(br.readLine());			
			sum=sum+num;
			if(num>50)
				break;	
		cnt++;
		
		}
		System.out.println("Sum= "+sum);

	}
}

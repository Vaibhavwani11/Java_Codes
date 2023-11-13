/*
 Write a program which accepts date month and year from user and checks for the validity of date according to month 
Input: 30/02/2018
Output: Date doesn't exists!!
 */
import java.io.*;
class calendar{

	public static void main(String [] args)throws IOException{
	
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);

		System.out.printf("Enter year:\n");
		int year=Integer.parseInt(br.readLine());
		System.out.printf("Enter Month:\n");
		int month=Integer.parseInt(br.readLine());
		System.out.printf("Enter date:\n");
		int days=Integer.parseInt(br.readLine());

		switch(month){
		
			case 1: if(days<1 || days>31)
					System.out.println("Date doen't exist");
				break;
		
			case 2: if(days<1 || days>31)
					System.out.println("Date doen't exist");
				break;
		
			case 3: if(days<1 || days>31)
					System.out.println("Date doen't exist");
				break;
		
			case 4: if(days<1 || days>31)
					System.out.println("Date doen't exist");
				break;
		
			case 5: if(days<1 || days>31)
					System.out.println("Date doen't exist");
				break;
		
			case 6: if(days<1 || days>31)
					System.out.println("Date doen't exist");
				break;
		
			case 7: if(days<1 || days>31)
					System.out.println("Date doen't exist");
				break;
		
			case 8: if(days<1 || days>31)
					System.out.println("Date doen't exist");
				break;
		
			case 9: if(days<1 || days>31)
					System.out.println("Date doen't exist");
				break;
		
			case 10: if(days<1 || days>31)
					System.out.println("Date doen't exist");
				break;
		
			case 11: if(days<1 || days>31)
					System.out.println("Date doen't exist");
			 	 break;
			
			case 12: if(days<1 || days>31)
					System.out.println("Date doen't exist");
				break;
			
			default: System.out.println("Date doen't exist");
				break;
		}

		System.out.println(days+"/"+month+"/"+year);
	}
}

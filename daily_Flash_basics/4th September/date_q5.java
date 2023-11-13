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

	if(month>12 || month<1){
		System.out.printf("Date doesn't exist\n");
	}	
	else{

		if(month==1 && (days>31 || days<1) ){
	
			System.out.printf("Date doesn't exits\n");
		}
		if(month==2 && (days<1 || days>28) ){
	
			System.out.printf("Date doesn't exits\n");
		}
		if(month==3 && (days<1 || days>31) ){
	
			System.out.printf("Date doesn't exits\n");
		}
		if(month==4 && (days<1 || days>30) ){
	
			System.out.printf("Date doesn't exits\n");
		}
		if(month==5 && (days<1 || days>31) ){
	
			System.out.printf("Date doesn't exits\n");
		}
		if(month==6 && (days<1 || days>30) ){
	
			System.out.printf("Date doesn't exits\n");
		}
		if(month==7 && (days<1 || days>31) ){
	
			System.out.printf("Date doesn't exits\n");
		}
		if(month==8 && (days<1 || days>31) ){
	
			System.out.printf("Date doesn't exits\n");
		}
		if(month==9 && (days<1 || days>30) ){
	
			System.out.printf("Date doesn't exits\n");
		}
		if(month==10 && (days<1 || days>31) ){
	
			System.out.printf("Date doesn't exits\n");
		}
		if(month==11 && (days<1 || days>30) ){
	
			System.out.printf("Date doesn't exits\n");
		}
		if(month==12 && (days<1 || days>31) ){
	
			System.out.printf("Date doesn't exits\n");
		}
		else{
		
			System.out.printf("%d/%d/%d\n",days,month,year);
		}
	}
		System.out.printlf("%d/%d/%d",days,month,year);
	}
}

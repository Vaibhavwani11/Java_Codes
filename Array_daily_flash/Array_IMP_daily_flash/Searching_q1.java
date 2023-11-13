/*1. Write a Java program to test if an array contains a specific value.
 myarray 1 = { 1789, 2035, = 1899, 2013, 1458, 2458, 1254, 1472, 2365);
 Contains 2013 in array ? Contains 2015 in array ?*/
import java.util.*;
class Searching{

	public static void main(String [] args){
		
		Scanner sc=new Scanner(System.in);

 		int  myarray1[]={1789, 2035, 1899, 2013, 1458, 2458, 1254, 1472, 2365};

		System.out.println("Enter Number to be Searched: ");
		int key=sc.nextInt();
		
		for(int i=0; i<myarray1.length; i++){

		
			if(myarray1[i]==key)
				System.out.println("Element Found");
			
			else
				System.out.println("Element Not Found");
		}	
	}
}

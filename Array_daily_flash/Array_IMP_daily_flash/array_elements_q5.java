/*5. Write a Java program to take 10 integer inputs from user and print the following:
   Number of positive numbers,number of negative numbers, number of odd numbers, number of even numbers, number of Os.*/
import java.util.*;
class Input{

	public static void main(String [] args){
	
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0; i<10; i++){
			
			System.out.println("Enter Number: ");
			arr[i]=sc.nextInt();
		}
		int ecnt=0, ocnt=0,pcnt=0, ncnt=0, zerocnt=0;
	
   	        for(int i=0; i<10; i++){
			
			if(arr[i]!=0){
			
				if(arr[i]%2==0)
					ecnt++;
		
				else if(arr[i]%2!=0)
					ocnt++;
			}
			
			 if(arr[i]==0)
				zerocnt++;

			if(arr[i]>0)
				pcnt++;
			
			else if(arr[i]<0)
				ncnt++;
		}
		System.out.println("Number of Even No.: "+ecnt);
		System.out.println("Number of Odd No.: "+ocnt);
		System.out.println("Number of Zeros: "+zerocnt);
		System.out.println("Number of Positive No.: "+pcnt);
		System.out.println("Number of Negative No.: "+ncnt);
	}
}

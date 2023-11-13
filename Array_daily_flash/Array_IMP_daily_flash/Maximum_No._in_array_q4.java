/* 4. Write a Java program which take age of students, find maximum & print the index of maximum age. 
 Take values from user.*/
import java.io.*;
class Max{

	public static void main(String [] args) throws IOException{
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		int arr[]=new int[5];
		int max=arr[0];
		int index=0;

		for(int i=0; i<arr.length; i++){
		
			System.out.println("Enter Number: ");
			arr[i]=Integer.parseInt(br.readLine());
			
			if(max<arr[i]){
				max=arr[i];
				index=i;
			}
		}
		System.out.println("Maximum No."+max+" at index "+index);
	}
}

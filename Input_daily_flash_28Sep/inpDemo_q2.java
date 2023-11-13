/*Write a Java Program to
Take name, roll number and field of interest from user and 
print in the format below :
Input:
	Name: Rosh
	Roll No: 101
	Field Of Interest: Art
Output:
	Hey, my name is Rosh and
	my roll number is 101. My field of interest are Art.
*/
import java.io.*;
class InpDemo{

	public static void main(String [] args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Enter Name: ");
		String name= br.readLine();
	
		System.out.println("Enter Roll No.: ");
		int rollNo= Integer.parseInt(br.readLine());
		
		System.out.println("Enter Interest");
		String intrest= br.readLine();

		System.out.printf("Hey, my name is %s and my rollno is %d. My field of Interest are %s\n",name,rollNo,intrest);
	}
}

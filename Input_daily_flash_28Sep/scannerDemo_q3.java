/*Write a java program to take two strings as a input from user using Scanner and 
 print them in same line. And Add space between them.
Input:	String1: Vijay
	String2: Devarkonda
Result: Vijay Devarkonda*/
import java.util.*;
class scannerDemo{

	public static void main(String [] args){
	
		Scanner sc= new Scanner(System.in);
	
		System.out.println("Enter Name & Surname: ");
		String name= sc.next();
		String surname=sc.next();

		System.out.println(name+" "+surname);
	}
}

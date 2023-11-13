/*3. Write a Java program which accepts marks of students in 1-D array & find total marks & percentage.*/
import java.util.*;
class array{

	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);

		int arr[]=new int[5];
		int marks=0;

		for(int i=0; i<arr.length;i++){
				
			System.out.println("Enter marks: ");
			arr[i]=sc.nextInt();
			marks= marks + arr[i];
		}

		int per=marks/arr.length;
		System.out.println("Total= "+marks);
		System.out.println("Percentage= "+per);
	}
}

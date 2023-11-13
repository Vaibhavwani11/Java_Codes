/*2. Write a Java program to find the index of an array element.
 my_array = (25, 14, 56, 15, 36, 56, 77, 18, 29, 49); Index position of 25 ?
 Index position of 77 ?*/
import java.util.*;
class Index{

	public static void main(String [] args){
	
		Scanner sc=new Scanner(System.in);

		int my_array[]={25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

		System.out.println("Enter element to be Searched: ");
		int key=sc.nextInt();

		for(int i=0; i<my_array.length; i++){
		
			if(my_array[i]==key)
				System.out.println(key+" found at index "+i);
			else
				System.out.println("Not found");

		}	
	}
}

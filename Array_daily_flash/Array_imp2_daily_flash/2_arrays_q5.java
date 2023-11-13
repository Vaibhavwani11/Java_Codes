/*Take size of the array from user. create two arrays of that size. Initialize all second array elements as zero(o).
  For the first array take all elements from user. Check if the element in first array is even or not 
  if its even then replace the value of second array of that index with -1. and print both the arrays
  Test case : Size of the array should be odd 
  P.S: Optional (EXTRA STUFF):you can use fill() function of Arrays*/
import java.util.*;
class Array{

	public static void main(String [] args){
	
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter odd size: ");
		int size=sc.nextInt();
		if(size%2!=0){

		int arr1[]=new int[size];
		int arr2[]=new int[size];

		for(int i=0; i<arr1.length; i++){
		
			System.out.println("Enter element for arr1:");
			arr1[i]=sc.nextInt();

			if(arr1[i]%2==0)
				arr2[i]=-1;
		}
		System.out.println("arr1: ");
		for(int i=0; i<arr1.length; i++){
				
			System.out.print(arr1[i]+" ");
		}	
		System.out.println("\narr2: ");
		for(int i=0; i<arr2.length; i++){
				
			System.out.print(arr2[i]+" ");
		}}
	}
}

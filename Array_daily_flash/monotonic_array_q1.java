/*Write a java program to check whether the given integer array enterd by user is monotonic or not
  {Note : An array is monotonic if it is either monotone increasing or monotone decreasing.}
 An array A is monotone increasing if:) for all i<=j, A[i]<=A[j]. 
 An array A is monotone decreasing if:) for all i<=j, A[i]>=A[j].
 Return true if and only if the given array A is monotonic.
 Structure of code:)
- Take an integer array as input from user of size defined by user.
- Pass this array to a static method checkMonotonic() having return type as Boolean
- If true print the array is monotonic else print is not monotonic.
Example: Input: size = 4     [1,2, 2, 3]
	 Output: The array is monotonic
 	 
	 Input: size = 3     [1,3,2]
 	 Output: The array is not monotonic*/
import java.lang.*;	
import java.util.*;	
class Monotonic{
	static boolean checkMonotonic(int iarr[]){
		
		System.out.println("In method");
		
		int j=0,flag=0;
		for(int i=0; i<iarr.length && j<iarr.length; i++){
		
			if(iarr[i]<=iarr[j] || iarr[i]>=iarr[j]){
			
			
				flag++;		
			}
			else{
				break;
			}
		j++;	
		}
		if(flag==(iarr.length-1))	
			
			return true;			

		else{
			return false;			
		
		}	
	}
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Size of array: ");	
		int size=sc.nextInt();

		int []arr=new int[size];
		
		for(int i=0; i<size; i++){

			System.out.println("Enter Number: ");	
			arr[i]=sc.nextInt();

		}
		System.out.println(Monotonic.checkMonotonic(new int[5]));
	}

}

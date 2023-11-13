/*Write a Java program to find the missing number in a sorted array Example: 
 Input:  {1,3,4,5,6} 
 Output:  2  */
class NumMiss{

	public static void main(String [] args){
	
		int arr[]={1,2,3,5,6};
		
		int num=0,j=1;
		for(int i=0; i<arr.length && j<arr.length; i++){
			
			if((arr[j]-arr[i])!=1){
			
				num=arr[i]+1;
			}	
			j++;
		}
		System.out.println("Missing num in Sorted array= "+num);
	}
}

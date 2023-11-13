/*
 Write a java program to print a jagged array of squares of numbers from 1 to 10.
 Use for loop to initialise the array and print it.
Input:
Output: 1  4 9 16
	25 36
	49 64 81 100
 */
class jaggedArray{

	public static void main(String [] args){
	
		int arr[][]=new int[3][];
		
		arr[0]= new int[4];
		arr[1]= new int[2];
		arr[2]= new int[4];

		int num=1;
		for(int i=0; i<3; i++){
		
			for(int j=0; j<arr[i].length; j++){
			
				arr[i][j]=num*num;
				num++;
			}
		}	
		for(int i=0; i<arr.length; i++){
		
			for(int j=0; j<arr[i].length; j++){
			
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}

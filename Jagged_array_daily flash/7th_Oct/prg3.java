/*
 
 Write a java program to print a jagged array of cubes of numbers from 10 to 1.
 Use for loop to initialise the array and print it.
Input:
Output: 1000  729 ..... 8 1 
 */
class jaggedArray{

	public static void main(String [] args){
			
		int [][]arr= new int[3][];
		
		arr[0]= new int[2];
		arr[1]= new int[5];
		arr[2]= new int[3];

		int num=10;
		for(int i=0; i<arr.length; i++){
		
			for(int j=0; j<arr[i].length; j++){
			
				arr[i][j]=num*num*num;
				num--;
			}
		}	
		for(int i=0; i<3; i++){
		
			for(int j=0; j<arr[i].length; j++){
			
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}

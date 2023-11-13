/*
 Write a java program to calculate average marks of each student from given marks.
 Number of students represent number of rows.
 Note that total number of tests for each student varies, hence calculate accordingly.
 Student 1: 50 60 70 90
 Student 2: 20 40 60 
 Student 3: 55 77 66 91
 
Input: 
Output: 50 60 70 90 
	20 40 80
        55 77 66 91
	
	Average of student 1 is: 67
	Average of student 2 is: 46
	Average of student 3 is: 72

*/
class jaggedArray{

	public static void main(String [] args){
	
		int [][]arr=new int[3][];
		
		arr[0]= new int[]{50,60,70,90};
		arr[1]= new int[]{20,40,60};
		arr[2]= new int[]{55,77,66,91};

		for(int i=0; i<arr.length; i++){
		
			for(int j=0; j<arr[i].length; j++){
			
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();	
		}	
		int sum=0;
		float avg=0;
		for(int i=0; i<arr.length; i++){
			
			avg=0;
			for(int j=0; j<arr[i].length; j++){
	
				sum+=arr[i][j];
			}
			avg=sum/arr[i].length;
			System.out.println("Average of "+i+" is: "+avg);
		}		
	}
}	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 

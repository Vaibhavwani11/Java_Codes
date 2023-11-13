
 /*Write a java program that accepts 3D Array and print number divisible by 5 from all
  
Input: Enter number of Planes: 2
       Enter number of Rows: 2
       Enter number of columns: 2
		
       Enter elements: 4 75 56 10 12 45 77 60
       Divisible by 2: 75 10 45 60 
 */
import java.util.*;
class Array3D{

	public static void main(String [] args){
		
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter number of Planes: ");
		int P= sc.nextInt();
		
		System.out.println("Enter number of Rows: ");
		int R= sc.nextInt();
		
		System.out.println("Enter number of Cols: ");
		int C= sc.nextInt();

		int arr[][][]= new int[P][R][C];

		for(int i=0; i<P; i++){
			
			for(int j=0; j<R; j++){
			
				for(int k=0; k<C; k++){
				
					System.out.print("Enter element: ");
					arr[i][j][k]=sc.nextInt();
				}
			}
		}		
		System.out.println("Numbers divisible by 5 are: ");
		for(int i=0; i<P; i++){
			
			for(int j=0; j<R; j++){
				
				for(int k=0; k<C; k++){
				
					if(arr[i][j][k]%5==0)
						System.out.print(arr[i][j][k]+" ");
				}
			}
		}
	}
}
   

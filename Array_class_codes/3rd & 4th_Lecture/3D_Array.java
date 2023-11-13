import java.io.*;
class Inp3D_Array{

	public static void main(String [] args)throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter number of Planes:");
		int plane=Integer.parseInt(br.readLine());

		System.out.println("Enter number of Rows:");
		int rows=Integer.parseInt(br.readLine());

		System.out.println("Enter number of Cols:");
		int cols=Integer.parseInt(br.readLine());
		
		int marr[][][]=new int[plane][rows][cols];
		
		for(int i=0; i<plane; i++){
		
			for(int j=0; j<rows; j++){
			
				for(int k=0; k<cols; k++){
					
					int a=Integer.parseInt(br.readLine());
					marr[i][j][k]=a;
				}
			}
		}	
		for(int i=0; i<plane; i++){
			
			System.out.println(i+" Plane are:");
			for(int j=0; j<rows; j++){
			
				for(int k=0; k<cols; k++){
					
					System.out.print(marr[i][j][k]+" ");
				}
			System.out.println();	
			}
		}
	}
}

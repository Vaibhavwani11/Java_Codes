import java.io.*;
class inpDemo{

	public static void main(String [] args)throws IOException{
	
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter size of array:");		
		int x= Integer.parseInt(br.readLine());

		int [] arr=new int[x];

		for(int i=0; i<x; i++){
		
			System.out.print("Enter Element:");
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println("Array Elements:");
		for(int i=0; i<x; i++){
		
			System.out.println(arr[i]);
		}
	}
}

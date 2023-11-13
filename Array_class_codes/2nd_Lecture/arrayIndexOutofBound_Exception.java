import java.io.*;
class Excess{

	public static void main(String [] args) throws IOException{
	
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		int[] arr= new int[5];

		for(int i=0; i<5; i++){
			
			System.out.println("Enter element:");
			arr[i]=Integer.parseInt(br.readLine());			
		}

		System.out.println("Array elements:");
		//First 5 elements will be printed then
		//It will give ArrayIndexOutofBoundsException after 5th element
		for(int i=0; i<8; i++){
		
			System.out.println(arr[i]);
		}
	}
}

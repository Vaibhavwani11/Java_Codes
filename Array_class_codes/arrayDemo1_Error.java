class arrDemo1{

	public static void main(String [] args){
			
		int arr[]={};//empty initialiser list
		//It will give runtime exception because 
		//arr memory is allocated at runtime not at compile time

		//int arr[]={1,2,3,4,5}; This will not give exception		
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;

		for(int i=0; i<5; i++){
		
			System.out.println(arr[i]);
		}
	}
}

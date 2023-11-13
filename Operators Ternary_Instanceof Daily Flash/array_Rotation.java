class Rotate{

	public static void main(String [] args){
	
		int arr[]= new int[]{1,2,3,4,5};

		for(int i=0; i<arr.length; i++){
		
			System.out.print(arr[i]+" ");
		}
		int temp1=0, temp2=arr[0];

		for(int i=0; i<5; i++){
		
			temp1= arr[i];
			arr[i]= temp2;
			
				
			temp2= temp1;
			//arr[i+1]= temp1;
			
		}
		//arr[0]=temp2;
	/*	temp2= arr[2];
		arr[2]= temp1;

		temp1 =arr[3];
		arr[3]= temp2;

		temp2=arr[4];
		arr[4]= temp1;

		arr[0]=temp2;
		
	*/	
		for(int j=0; j<arr.length; j++){
		
			System.out.print("     "+arr[j]+" ");
		}
	}
}

class className{

	public static void main(String [] args){
	
		int arr[]={10,20,30,40,50};

		//int is a Special class
		int[] array =new int[5];
		
		int num=10;
		for(int i=0; i<5; i++){
		
			array[i]=num;
			num+=10;	
		}

		for(int i=0; i<5; i++){
		
			System.out.println(array[i]);
		}
		
		System.out.println(array.getClass());
		//class [I 
		//This is Runtime Signature
		//for Float Runtime Signature is class [F
	}
}

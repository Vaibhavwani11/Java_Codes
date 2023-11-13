class Array{

	public static void main(String [] args){
	
	//	int arr[]={10.5f,20.2f,30.5f,40.5f,50.5f}; //Error: Possible loosy conversion from float to int

	//	int arr[]={'A','B','C'};  //65 66 67 {will be stored as integers}

	//	int arr[]={"Shashi", "Vaibhav","Rajesh"};  //Error: String cannot be converted to int

		String arr[]={"Shashi", "Vaibhav", "Rajesh"};

		for(int i=0; i<arr.length; i++){
		
			System.out.println(arr[i]);
		}
	}
}

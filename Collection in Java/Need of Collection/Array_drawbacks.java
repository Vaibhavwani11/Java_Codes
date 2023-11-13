class Array{

	public static void main(String [] args){
	
		Object arr[]= new Object[] {10,20,"30.5f",40,50};
		//Only elements of same data type can be inserted
		
		for(int i=0; i<arr.length; i++){
			
			System.out.println(arr[i]);
		}
	}
}

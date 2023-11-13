class StringArr{

	public static void main(String [] args){
	
		String s1= new String("Microsoft");
		String s2= new String("Google");
		StringBuffer s3= new StringBuffer("Amazon");
		StringBuilder s4= new StringBuilder("Tesla");
		String s5= new String("Biencaps");

		Object arr[]= new Object[5]; //We can insert another type of data in array of Object type
					     //In String array we cannot enter StringBuffer/StringBuilder type Strings
	       	arr[0]=s1;
	       	arr[1]=s2;
	       	arr[2]=s3;
	       	arr[3]=s4;
	       	arr[4]=s5;

		for(int i=0; i<arr.length; i++){
		
			System.out.println(arr[i]);
		}

	}
}

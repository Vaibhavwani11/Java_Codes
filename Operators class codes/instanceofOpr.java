class Cricket{
	public static void main(String [] args){
		boolean res;
		
		Cricket obj= new Cricket();
		System.out.println(obj instanceof Cricket); 	//instance of returns Boolean value
		System.out.println(obj instanceof Object);		//[true] Object class is parent class of every class
	
		res= obj instanceof Cricket;	//true
		System.out.println(res);
	}
}//Returns true if object made is of that particular class.
class Compare{
	
	public static void main(String [] args){
		
		Compare obj= new Compare();
		obj.Numbers();

	}
	void Numbers(){
		
		int num1=10;
		int num2=12;
		String result= null;

		result=(num1>num2)? "num1 is greater" : "num2 is greater";
		System.out.println(result);
	}
}
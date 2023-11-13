class Core2Web{

	public static void main(String [] args){
	
		int var1=10;
		int var2= ++var1 + ++var1; //23 (Reference is not passed in java directly value is passed)

		System.out.println(var1); //12
		System.out.println(var2); //23
	}
}

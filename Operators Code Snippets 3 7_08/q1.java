class Core2Web{

	public static void main(String [] args){
	
		int var1=10;
		int var2= -var1; //-10
		int var3= var1 * var2; //-100
		int var4= var1 * -var2; //100

		if(var3== -var4)
			System.out.println(var3);	//-100

		else{
			System.out.println(var4);
		}
	}
}

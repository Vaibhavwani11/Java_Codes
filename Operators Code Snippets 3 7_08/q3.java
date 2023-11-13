class Core2Web{

	public static void main(String [] args){
	
		int var1=20;
		int var2= ++var1; //21
		int var3= var2++; //21
		int var4= var1--; //21

		int var5= ++var1 + var2++ - --var2 + ++(var1++);	//error unexpected type
		// if bracket is removed 21 + 22  - 22 + 22 

		System.out.println(var5);
	}
}

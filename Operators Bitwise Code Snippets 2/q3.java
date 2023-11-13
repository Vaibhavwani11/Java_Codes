
class Core2Web{
	
	public static void leftshift(int var1 ,int var2){
	
		var1<<=var2;
		
		
	}
	public static void main(String [] args){
		
		int var1=4, var2=2;
		leftshift(var1,var2);
		System.out.println(var1);
	}
}//java only ever passes arguements  to a method by value(i.e. a copy of the variable)and never by reference.
// Therfore, the value of the variable var1 remains unchanged in the main method.

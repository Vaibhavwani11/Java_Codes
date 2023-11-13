class CompareIf{

	void IfElse(){
		
		int num1=10;
		int num2=15;
			
		if(num1>num2){
			System.out.println("num1 is greater"+num1);
		}
		else{
			System.out.println("num2 is greater=" +num2);
		}
	}
	
	public static void main(String [] args){
		CompareIf object=new CompareIf();
		object.IfElse();
	}
}
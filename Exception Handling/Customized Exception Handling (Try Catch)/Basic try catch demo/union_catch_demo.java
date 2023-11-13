class UnionCatch{

	public static void main(String [] args){
	
		UnionCatch o= null;//new UnionCatch();
		try{

			o.fun();
			//System.out.println(10/0);
		}
		catch(ArithmeticException | NullPointerException obj){
		
			System.out.println("Catched");
		}
	}
	void fun(){
	
		System.out.println("In fun");
	}
}

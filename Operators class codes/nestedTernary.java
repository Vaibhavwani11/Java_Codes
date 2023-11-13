class nestedTernary{

	public static void main(String [] args){
		int x=10;
		int y=5;
		int z=2;
		int ans=0;
		
		ans=(x>y)? ((x>z)?x : z) : ((y>z)? y : z);	//Greatest Number

		System.out.println(ans);  //x		
	}
}
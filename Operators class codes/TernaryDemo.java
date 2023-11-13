class TernaryStr	{

	public static void main(String [] args){
		int x=10;
		int y=2;
		String ans;	// or String ans=null;
		
		ans=(x<y)? "x is small" : "y is small";	//just like If else...i.e. if (x<y) print x else y.

		System.out.println(ans);  //y is small		
	}
}
class CompString{

	public static void main(String [] args){
	
		char carr[]={'a','b','c'};
	
		String s1=new String(carr);

		String s2="abc";

		System.out.println(s1+" "+s2);
		
		//System.out.println(s);
		if(s1==s2)
			System.out.println("Same");
		else
			System.out.println("Diff");
	}
}

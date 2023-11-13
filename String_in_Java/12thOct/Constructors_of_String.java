class stringConstructorDemo{

	public static void main(String [] args){
	
	//1.Null Parameter
		String s1=new String(); //Constructor has no Parameter

		System.out.println(s1); //NULL
		System.out.println(s1.length()); //0
	
	//2.String Parameter
		String s2=new String("Core2Web"); //Constructor has String parameter
	
		System.out.println("\n"+s2); //Core2Web
		System.out.println(s2.length()); //8
	
	//3.character Array Parameter
		char carr[]={'A','B','C','D','E'};
		String s3=new String(carr); //Constructor has character Array parameter
	
		System.out.println("\n"+s3); //ABCDE
		System.out.println(s2.length()); //5
	
	//4.byte Array Parameter
		byte barr[]={100,101,102,103,104,105};
		String s4=new String(barr); //Constructor has byte array parameter
	
		System.out.println("\n"+s4); //defghi
		System.out.println(s4.length()); //6
	}
}

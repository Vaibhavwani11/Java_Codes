class Demo{

	void m1(String s1){
	
		System.out.println("String Method");
	}
	void m1(StringBuffer sb1){
	
		System.out.println("StringBuffer is passed");
	}
	void m1(Object ob){
	
		System.out.println("StringBuffer is passed");
	}
}
class Test{

	public static void main(String [] args){
	
		Demo obj=new Demo();
		obj.m1("Vaibhav"); //String s1="Vaibhav"
		obj.m1(new StringBuffer("Vaibhav")); //StringBuffer sb1=new StringBuffer("Vaibhav")

//		obj.m1(null); //Here, null can be passed to both methods, So ambiguity occurs
		//bt if there is Parent-Child relation btwn Classes then parameter will be Passed to Child
		//{see next program}
	}
}

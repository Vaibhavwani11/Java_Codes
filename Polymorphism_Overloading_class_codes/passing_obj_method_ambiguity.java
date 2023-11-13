class Demo{

	void m1(Object o1){
	
		System.out.println("Object Method");
	}
	void m1(String s1){
	
		System.out.println("String Method");
	}
}
class Test{

	public static void main(String [] args){
	
		Demo obj=new Demo();
		obj.m1("Vaibhav"); //String s1="Vaibhav"
		obj.m1(new StringBuffer("Vaibhav")); //Object o1=new StringBuffer("Vaibhav") [Parent Reference & Child Object]

		obj.m1(null); //Here, null can be passed to both methods, So ambiguity occurs
		//bt Here is Parent-Child relation btwn Classes then parameter will be Passed to Child

	}
}

//static modifier is not considered in Method Signature, So both method signature become same, which results in Error
class Core2web{

	static int var1=10;	
	static int getVar1(){
	
		return var1;
	}
	int getVar1(){

		return ++var1;
	}
	public static void main(String [] args){
	
		Core2web c2w=new Core2web();
		System.out.println(c2w.getVar1());
	}
}

//static Method cannot be Overrided
class Core2web{

	static int var1=10;	
	static int getVar1(){
	
		return var1;
	}
}
class Test extends Core2web {	
	int getVar1(){
		
		return ++var1;
	}
	public static void main(String [] args){
	
		Core2web c2w=new Test();
		System.out.println(c2w.getVar1());
	}
}

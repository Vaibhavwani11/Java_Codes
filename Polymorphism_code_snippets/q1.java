//getClass is the method of Object class.it is written final, So, it cannot be Overrided.
class Core2web{

	int var1;
	Core2web(){
	
		var1=10;
	}
	void getClass(){
		System.out.println("getClass "+"Core2web");
	}
	String getClass(int num){

		System.out.println("getClass "+"Core2web");
		return new String("Biencaps");
	}
	public static void main(String [] args){
	
		Core2web c2w=new Core2web();
		System.out.println(c2w.getClas(45));
	}
}

//Private class is not allowed in java
//bt we can write private constructor in our code 
//it won't be shown in the Byte code

Private class V{
	void add(){

	}
}
class IPL{
	
	private IPL(){
	
	}
	public static void main(String[] args) {
		V obj=new V();
	}
}

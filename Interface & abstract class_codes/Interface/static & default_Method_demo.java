//We can write Body to the methods of interface by writing static/default keyword
interface MumbaiMarket{

	default void quality(){
	
		System.out.println("Best Quality");
	}
	static void Brand(){
	
		System.out.println("PUMA");
	}
	void Price();
}
class Sunilshop implements MumbaiMarket{

	public void Price(){
		
		System.out.println("600-700");
	}
}
class TilakRoad implements MumbaiMarket{

	public void Price(){
		
		System.out.println("900-1000");
	}
}
class Customer{

	public static void main(String [] args){
	
		MumbaiMarket obj=new Sunilshop();
		MumbaiMarket.Brand();  //static Method should be called by InterfaceName.method();
		obj.quality();	       //default method can be called simply like instance method i.e.obj.method();
		obj.Price();
		
		MumbaiMarket obj1=new TilakRoad();
		obj.quality();
		obj1.Price();
	}
}

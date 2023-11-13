//We can write Body to the methods of interface by writing static/default keyword
interface MumbaiMarket{

	static void quality(){
	
		System.out.println("Best Quality");
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
		MumbaiMarket.quality();  //static Method should be called by InterfaceName.method();
		obj.Price();
		
		MumbaiMarket obj1=new TilakRoad();
		MumbaiMarket.quality();
		obj1.Price();
	}
}

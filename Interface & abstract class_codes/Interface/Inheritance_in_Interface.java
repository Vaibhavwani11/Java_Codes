interface VegeStore{

	void vegetables();
}
interface Dominos extends VegeStore{

	void pizzaBase();
}
//Both Methods must be Overrided in child class
class kalyanDominos implements Dominos{

	public void pizzaBase(){
	
		System.out.println("Make Pizza");
	}
	public void vegetables(){
	
		System.out.println("Cut Vegetables");
	}
}
class Customer{

	public static void main(String [] args){
	
		Dominos kd=new kalyanDominos();
		kd.pizzaBase();
		kd.vegetables();
	}
}

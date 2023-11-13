class Dominos{
	int price=200;
	int quantity=2;
	static int total=100;

		
	static void bill(){
		Dominos obj=new Dominos();
		System.out.println("Price="+obj.price);
		System.out.println("Quantity="+obj.quantity);
		System.out.println("Total="+obj.price*obj.quantity);
			
	}
	public static void main(String []args){
		Dominos pizza= new Dominos();
		pizza.price=250;	
		Dominos fires=new Dominos();
		fires.quantity=3;
	
		Dominos.bill();
	}	
}
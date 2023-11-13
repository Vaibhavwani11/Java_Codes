//In Method Inner Class, class is written inside Method.
class Zomato{

	void order(){
	
		System.out.println("In Order Method");
		class Hotels{
		
			String hotelName=null;
			Hotels(String hotelName){
			
				this.hotelName=hotelName;
			}
			void orderPlaced(){
			
				System.out.println("Order Placed at= "+hotelName);
			}
		}
		Hotels h=new Hotels("Morya Grand");
		h.orderPlaced();
	}
	public static void main(String [] args){
	
		Zomato z=new Zomato();
		z.order();
	}
}

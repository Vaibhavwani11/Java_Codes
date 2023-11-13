//Method local Inner class mdhe static methods and variables chalat nahi
class Zomato{

	int x=10;
	static int y=20;
	static void order(){
		
		//static int a=1;
		class Hotels{
			 
			void orderPlaced(){
			//	System.out.println(x); //Error:Nonstatic var cannot be referenced from static context
				System.out.println(y); //20
			}
			void maifen(){
			
				//Hotels h=new Hotels();
				orderPlaced();
			}
		}
		Hotels h1=new Hotels();
		h1.maifen();
	}
	public static void main(String[] args){
		
		order();
	}
}

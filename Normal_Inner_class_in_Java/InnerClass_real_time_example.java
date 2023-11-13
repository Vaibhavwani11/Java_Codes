class IndianDefence{
	
	//Constructor of outer class
	IndianDefence(){
	
		System.out.println("Major General Bipin Rawat");
	}
	class Army{
	
		void attack(){
			System.out.println("URI attack");
		}	
	}
	class Navy{
		
		void attack(){
			System.out.println("Gazi attack");
		}	
	
	}
	class AirForce{
		
		void attack(){
			System.out.println("Balakot attack");
		}	
	
	}
	public static void main(String [] args){
	
		IndianDefence obj= new IndianDefence();
	        //Army obj1= new Army(); //Error: Non-static variable this cannot be refernced from static context
		//obj1.attack();

	        Army obj1= obj.new Army(); //Making object of inner class on object of Outer class
		obj1.attack();

		Navy obj2= obj.new Navy(); 
		obj2.attack();

		AirForce obj3= obj.new AirForce();
		obj3.attack();
	}
}

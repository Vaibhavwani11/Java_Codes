/*1. Write Java program which represents a restaurant menu card using Inner class concept of Java.
 Write a class outer called restaurant inner class called drinks,food and so on.
 Write the main method in another class.
(Access method of outer class and inner class from another class.)*/
class Restaurant{

	Restaurant(){
	
		System.out.println("Welcome to Hotel Morya Grand!");	
	}
	class Food{
		
		Food(int choice){
		
			if(choice==1)
				pavBhaji();

			 if(choice==2)
				kajuPanner();
		}	
		void pavBhaji(){
			System.out.println("served PavBhaji.");
		}
		void kajuPanner(){
			System.out.println("served kajuPanner.");
		}

	}
	class Drinks{

		Drinks(int choice){
		
			if(choice==1)
				cocacola();

			 if(choice==2)
				mocktail();
		}	
		void cocacola(){
			System.out.println("Cold drink");
		}
		void mocktail(){
			System.out.println("Hot drink");
		}
	}
}
class Customer{

	public static void main(String [] args){
	
		Restaurant r=new Restaurant();
		Restaurant.Food f= r.new Food(2);
		Restaurant.Drinks d= r.new Drinks(1);
	}
}



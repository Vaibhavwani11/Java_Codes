//.class files will be:- Home.class, Home$1Cupboard.class, Home$1Cupboard$Shelf2.class
class Home{

	void BedRoom(){
	
		System.out.println("In BedRoom");
		class Cupboard{
			
			{System.out.println("Open cupboard");}  //written just to show that we can write outside method like this
			void vaibhav(){
				
				System.out.println("In cupboard");
				class Shelf2{
					
					void shirts(){
						
						System.out.println("Pick up 1 shirt from 2nd shelf of cupboard");
					}
				}
			Shelf2 s1=new Shelf2();
			s1.shirts();
			}
		}
	Cupboard c1=new Cupboard();
	c1.vaibhav();
	}
}
class Function{

	public static void main(String [] args){
	
		Home obj=new Home();
		obj.BedRoom();
	}
}

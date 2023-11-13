/*5.Write a Java program which represents a mall using inner class concept of Java.
 Write a class outer called mall, inner class called food, shopping and so on.
 Write the main method in another class.
(Access method of outer class and inner class from another class.)*/
class Mall{

	Mall(int choice){
	
		if(choice==1)
			food();

		else if(choice==2)
			shopping();
	}
	void food(){
	
		class Mcd{
			void order(){	
				System.out.println("Cheese Burst Pizza");
			}
		}
		class JumboKing{
			void order(){	
				System.out.println("Sunday Special Pack");
			}
		}
		Mcd p=new Mcd();
		p.order();
	}
	void shopping(){
	
		class BigBazar{
			void buy(){	
				System.out.println("Groceries");
			}
		}
		class Hrx{
			void buy(){	
				System.out.println("T-Shirt");
			}
		}
		Hrx t=new Hrx();
		t.buy();
	}
}
class Holiday{

	public static void main(String [] args){
	
		Mall m= new Mall(1);
	}
}

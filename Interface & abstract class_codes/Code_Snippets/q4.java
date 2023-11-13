//Static things are not allowed in Inner class
class Outer{

	static{
	
		System.out.println("In Outer Static");
	}
	class Inner{
	
		static{
	
			System.out.println("In Inner Static");
		}
	}
	public static void main(String [] args){
	
		new Outer();
		Outer.Inner obj=new Outer().new Inner();
	}
}
